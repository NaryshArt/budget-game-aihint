package org.project.hint.rag;

import org.project.hint.api.dto.HintRequest;
import org.springframework.stereotype.Component;

@Component
public class QueryBuilder {

    // Состояние → короткий текст для векторного поиска,
    // например «У игрока 200 монет, через 1 ход платить аренду 200, осталось 8 ходов»
    public String build(HintRequest request) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
