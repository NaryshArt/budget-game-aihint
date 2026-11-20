package org.project.hint.rag;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class HybridRetriever implements Retriever {

    private final EmbeddingClient embeddingClient;

    @Override
    public List<RetrievedChunk> retrieve(Set<String> tags, String queryText, int topK) {
        // TODO: фильтр по тегам (+ general)
        // TODO: эмбеддинг queryText, косинусная близость через pgvector внутри отфильтрованного
        // TODO: top-k с порогом минимальной близости из SettingsService
        throw new UnsupportedOperationException("TODO");
    }
}
