package org.project.hint.rag;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class TagRetriever implements Retriever {

    @Override
    public List<RetrievedChunk> retrieve(Set<String> tags, String queryText, int topK) {
        // TODO: активные фрагменты с пересечением по тегам (+ general)
        // TODO: ранжирование по числу совпавших тегов, top-k
        // TODO: если ничего не найдено — только фрагменты general
        throw new UnsupportedOperationException("TODO");
    }
}
