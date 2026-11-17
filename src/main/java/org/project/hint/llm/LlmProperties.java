package org.project.hint.llm;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "llm")
public class LlmProperties {

    private String apiKey;      // из переменной окружения AI_API_KEY
    private String baseUrl;
    private String model;
    private int maxTokens;
    private double temperature;
    private int timeoutSeconds;
}
