package org.wild.nature.classes;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.service.Activity;

import java.util.Random;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Animal implements Activity {

    private final String type;
    private volatile AnimalActivity activity;
    protected AnimalActivity[] availableActivities;

    @Override
    public void performActivity(AnimalActivity activity) {
        this.activity = activity;
    }

    public void setRandomActivity() {
        AnimalActivity activity = availableActivities[new Random().nextInt(availableActivities.length)];
        performActivity(activity);
    }

    @Override
    public String toString() {
        return type;
    }
}
