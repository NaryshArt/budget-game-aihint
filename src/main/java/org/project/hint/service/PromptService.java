package org.project.hint.service;

import org.project.hint.domain.PromptVersion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromptService {

    // TODO: при наличии БД — использовать PromptVersionRepository
    // TODO: пока активный промпт берётся из application.yml

    public String getActivePrompt() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public List<PromptVersion> listVersions() {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public PromptVersion create(String text, String comment, String createdBy) {
        // TODO: создать новую версию (не активную), записать в audit_log
        throw new UnsupportedOperationException("TODO");
    }

    public void activate(Long id, String activatedBy) {
        // TODO: снять флаг active у текущей, поставить у новой, записать в audit_log
        throw new UnsupportedOperationException("TODO");
    }
}
