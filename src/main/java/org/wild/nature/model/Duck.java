package org.wild.nature.model;

import org.wild.nature.enums.AnimalActivity;

public class Duck extends Animal {

    public Duck(String number) {
        super("Утка " + number);
        availableActivities = new AnimalActivity[]{
                AnimalActivity.FLYING,
                AnimalActivity.EATING,
                AnimalActivity.SLEEPING,
                AnimalActivity.WALKING,
                AnimalActivity.SWIMMING
        };
    }
}
