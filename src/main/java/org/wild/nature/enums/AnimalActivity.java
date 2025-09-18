package org.wild.nature.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.wild.nature.enums.enumValues.ActivityLabels;

@Getter
@AllArgsConstructor
public enum AnimalActivity {

    SLEEPING(ActivityLabels.SLEEPING),
    HUNTING(ActivityLabels.HUNTING),
    EATING(ActivityLabels.EATING),
    WALKING(ActivityLabels.WALKING),
    FLYING(ActivityLabels.FLYING),
    SWIMMING(ActivityLabels.SWIMMING);

    private final String displayValue;
}
