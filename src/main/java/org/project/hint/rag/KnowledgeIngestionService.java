package org.project.hint.rag;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class KnowledgeIngestionService {

    private final Chunker chunker;
    private final EmbeddingClient embeddingClient;

    // TODO: репозитории KnowledgeDocument, KnowledgeChunk, Tag и AuditLog после появления сущностей

    // Документ → фрагменты → теги (только из словаря) → эмбеддинги (если включены векторы) → запись. Возвращает id документа
    public Long ingest(String title, String text, String language, List<String> tags, String createdBy) {
        // TODO: валидация размера документа и тегов по словарю, запись в audit_log
        throw new UnsupportedOperationException("TODO");
    }

    // Правка создаёт новую версию и переиндексирует только этот документ; старая версия деактивируется
    public Long update(Long documentId, String title, String text, List<String> tags, String updatedBy) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public void deactivate(Long documentId, String deactivatedBy) {
        // TODO: выключить документ и его фрагменты без удаления, запись в audit_log
        throw new UnsupportedOperationException("TODO");
    }

    // Пересчёт эмбеддингов всей базы знаний (при смене модели эмбеддингов)
    public void reindexAll(String requestedBy) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
