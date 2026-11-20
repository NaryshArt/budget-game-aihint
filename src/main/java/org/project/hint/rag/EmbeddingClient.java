package org.project.hint.rag;

import org.springframework.stereotype.Component;

@Component
public class EmbeddingClient {

    // Размерность результата задаётся моделью эмбеддингов и должна совпадать с vector(N) в схеме
    public float[] embed(String text) {
        // TODO: HTTP-вызов модели эмбеддингов (модель и провайдер не выбраны)
        // TODO: ключ только из переменной окружения, таймаут
        throw new UnsupportedOperationException("TODO");
    }
}
