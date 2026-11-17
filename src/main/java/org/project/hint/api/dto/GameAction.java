package org.project.hint.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class GameAction {

    @NotBlank
    private String id;

    @NotBlank
    private String location;

    @Min(1)
    private int timeCost;

    private String effect;

    // оценка хода, проставляется ActionScorer'ом перед отправкой в LLM
    private double score;
}
