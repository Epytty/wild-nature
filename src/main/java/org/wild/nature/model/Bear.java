package org.wild.nature.model;

import org.wild.nature.enums.AnimalActivity;

public class Bear extends Animal {

    public Bear(String number) {
        super("Медведь " + number);

        availableActivities = new AnimalActivity[]{
                AnimalActivity.EATING,
                AnimalActivity.HUNTING,
                AnimalActivity.SLEEPING,
                AnimalActivity.WALKING,
                AnimalActivity.SWIMMING
        };
    }
}
