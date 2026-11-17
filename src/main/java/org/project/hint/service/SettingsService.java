package org.project.hint.service;

import org.springframework.stereotype.Service;

@Service
public class SettingsService {

    // TODO: при наличии БД — читать из таблицы setting, кэшировать в памяти
    // TODO: пока настройки живут в application.yml через LlmProperties

    public boolean isLlmEnabled() {
        // TODO: аварийный выключатель
        return true;
    }

    public int getHintLimit() {
        // TODO
        return 10;
    }

    public double getScorerWeight(String key) {
        // TODO: веса для ActionScorer
        return 1.0;
    }

    public void set(String key, String value, String updatedBy) {
        // TODO: валидация диапазона, сохранение, запись в audit_log
        throw new UnsupportedOperationException("TODO");
    }
}
