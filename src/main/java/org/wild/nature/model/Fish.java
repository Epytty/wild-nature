package org.wild.nature.model;

import org.wild.nature.enums.AnimalActivity;

public class Fish extends Animal {

    public Fish(String number) {
        super("Рыба " + number);
        availableActivities = new AnimalActivity[]{
                AnimalActivity.EATING,
                AnimalActivity.SLEEPING,
                AnimalActivity.SWIMMING
        };
    }
}
