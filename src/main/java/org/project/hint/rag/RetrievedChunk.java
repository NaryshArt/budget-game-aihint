package org.project.hint.rag;

import java.util.List;

// Найденный фрагмент базы знаний; similarity — косинусная близость (для TagRetriever — доля совпавших тегов)
public record RetrievedChunk(
        String id,
        String title,
        String text,
        List<String> tags,
        double similarity
) {
}
