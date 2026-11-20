package org.project.hint.rag;

import org.project.hint.api.dto.HintRequest;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class SituationAnalyzer {

    // Состояние игры → теги ситуации из словаря (low_money, rent_due_soon, late_game, time_short...)
    public Set<String> analyze(HintRequest request) {
        // TODO: правила превращения состояния в теги после получения правил игры
        // TODO: пороги (что такое «мало денег» и т.п.) брать из SettingsService
        throw new UnsupportedOperationException("TODO");
    }
}
