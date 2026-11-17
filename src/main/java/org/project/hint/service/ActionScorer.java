package org.project.hint.service;

import lombok.RequiredArgsConstructor;
import org.project.hint.api.dto.GameAction;
import org.project.hint.api.dto.HintRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ActionScorer {

    private final SettingsService settingsService;

    // Проставляет score каждому ходу и возвращает тот же список
    public List<GameAction> score(HintRequest request) {
        // TODO: реализовать формулы оценки после получения правил игры
        // TODO: учитывать срочность (rentDueInTurns), число оставшихся ходов, показатели игрока
        // TODO: параметры (веса, пороги) брать из settingsService
        throw new UnsupportedOperationException("TODO");
    }

    // Возвращает ход с максимальным score (запасной вариант при сбое LLM)
    public GameAction bestByScore(List<GameAction> scoredActions) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
