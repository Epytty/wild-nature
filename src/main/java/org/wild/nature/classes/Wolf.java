package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;

public class Wolf extends Animal {

    public Wolf(String number) {
        super("Волк " + number);
        availableActivities = new AnimalActivity[]{
                AnimalActivity.EATING,
                AnimalActivity.HUNTING,
                AnimalActivity.SLEEPING,
                AnimalActivity.WALKING,
                AnimalActivity.SWIMMING
        };

        setRandomActivity();
    }
}
