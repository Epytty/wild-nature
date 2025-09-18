package org.wild.nature.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AnimalActivity {

    SLEEPING("Спит"),
    HUNTING("Охотится"),
    EATING("Ест"),
    WALKING("Ходит"),
    FLYING("Летает"),
    SWIMMING("Плавает");

    private final String displayValue;
}
