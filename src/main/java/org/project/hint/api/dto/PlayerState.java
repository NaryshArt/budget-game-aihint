package org.project.hint.api.dto;

import lombok.Data;

@Data
public class PlayerState {

    private int money;
    private int health;
    private int education;
    private int happiness;

    // TODO: добавить поля после получения полного списка показателей от команды
}
