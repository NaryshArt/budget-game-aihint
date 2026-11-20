package org.project.hint.rag;

import java.util.List;
import java.util.Set;

public interface Retriever {

    // tags — теги ситуации от SituationAnalyzer (general добавляется реализацией)
    // queryText — описание ситуации от QueryBuilder (TagRetriever его не использует)
    List<RetrievedChunk> retrieve(Set<String> tags, String queryText, int topK);
}
