package org.project.hint.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.List;

@Data
public class HintRequest {

    @NotBlank
    private String gameId;

    @Min(1)
    private int turn;

    @Min(1)
    private int totalTurns;

    @Valid
    private PlayerState stats;

    private List<String> inventory;

    // TODO: job, housing, currentEvent — расширить по правилам игры

    @Min(0)
    private int timeLeftThisTurn;

    @Valid
    @NotEmpty
    private List<GameAction> availableActions;
}
