package org.project.hint.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HintResponse {

    private String recommendedActionId;
    private String reason;
    private String source; // "llm" или "rules"
}
