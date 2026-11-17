package org.project.hint.llm;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class LlmClient {

    private final LlmProperties properties;

    // prompt — системный + пользовательский промпт, собранный PromptBuilder'ом
    // allowedIds — список допустимых id ходов, передаётся как enum в tool use
    public LlmChoice call(String prompt, List<String> allowedIds) {
        // TODO: HTTP-вызов через RestClient
        // TODO: структурированный ответ через tool use / function calling
        // TODO: таймаут + один повтор при 429/5xx
        throw new UnsupportedOperationException("TODO");
    }
}
