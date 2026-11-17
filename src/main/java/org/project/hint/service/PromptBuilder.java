package org.project.hint.service;

import lombok.RequiredArgsConstructor;
import org.project.hint.api.dto.GameAction;
import org.project.hint.api.dto.HintRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PromptBuilder {

    private final PromptService promptService;

    // Возвращает готовый промпт: системная часть из активной версии +
    // пользовательская часть с состоянием игрока и оценёнными ходами в JSON
    public String build(HintRequest request, List<GameAction> scoredActions) {
        // TODO: взять активный промпт из promptService.getActivePrompt()
        // TODO: сериализовать request + scoredActions в JSON
        // TODO: подставить в шаблон
        throw new UnsupportedOperationException("TODO");
    }
}
