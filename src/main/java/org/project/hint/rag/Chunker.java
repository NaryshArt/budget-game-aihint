package org.project.hint.rag;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Chunker {

    // Разбиение документа на фрагменты: ориентир 200–500 слов или по смысловым границам
    public List<String> split(String text) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
