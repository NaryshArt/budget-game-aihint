package org.project.hint.service;

import lombok.RequiredArgsConstructor;
import org.project.hint.api.dto.GameAction;
import org.project.hint.api.dto.HintRequest;
import org.project.hint.api.dto.HintResponse;
import org.project.hint.exception.TooManyHintsException;
import org.project.hint.llm.LlmClient;
import org.project.hint.llm.LlmChoice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Service
@RequiredArgsConstructor
public class HintService {

    private final ActionScorer actionScorer;
    private final PromptBuilder promptBuilder;
    private final LlmClient llmClient;
    private final SettingsService settingsService;

    // gameId -> счётчик подсказок; TODO: очищать завершённые партии
    private final Map<String, AtomicInteger> hintCounters = new ConcurrentHashMap<>();

    public HintResponse getHint(HintRequest request) {
        checkHintLimit(request.getGameId());

        List<GameAction> scoredActions = actionScorer.score(request);

        if (!settingsService.isLlmEnabled()) {
            return fallback(scoredActions);
        }

        try {
            String prompt = promptBuilder.build(request, scoredActions);
            List<String> allowedIds = scoredActions.stream().map(GameAction::getId).toList();

            LlmChoice choice = llmClient.call(prompt, allowedIds);
            validateActionId(choice.getActionId(), allowedIds);

            return new HintResponse(choice.getActionId(), choice.getReason(), "llm");
        } catch (Exception e) {
            return fallback(scoredActions);
        }
    }

    private void checkHintLimit(String gameId) {
        int limit = settingsService.getHintLimit();
        int count = hintCounters
                .computeIfAbsent(gameId, k -> new AtomicInteger(0))
                .getAndIncrement();
        if (count >= limit) {
            throw new TooManyHintsException(gameId);
        }
    }

    private void validateActionId(String actionId, List<String> allowedIds) {
        if (!allowedIds.contains(actionId)) {
            throw new IllegalStateException("LLM returned unknown actionId: " + actionId);
        }
    }

    private HintResponse fallback(List<GameAction> scoredActions) {
        GameAction best = actionScorer.bestByScore(scoredActions);
        return new HintResponse(best.getId(), null, "rules");
    }
}
