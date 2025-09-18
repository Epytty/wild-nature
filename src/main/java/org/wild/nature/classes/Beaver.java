package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;

public class Beaver extends Animal {

    public Beaver(String number) {
        super("Бобёр " + number);
        availableActivities = new AnimalActivity[]{
                AnimalActivity.EATING,
                AnimalActivity.SLEEPING,
                AnimalActivity.WALKING,
                AnimalActivity.SWIMMING
        };

        setRandomActivity();
    }
}
