package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;

public class Peacock extends Animal {

    public Peacock(String number) {
        super("Павлин " + number);
        availableActivities = new AnimalActivity[]{
                AnimalActivity.FLYING,
                AnimalActivity.EATING,
                AnimalActivity.SLEEPING,
                AnimalActivity.WALKING,
        };

        setRandomActivity();
    }
}
