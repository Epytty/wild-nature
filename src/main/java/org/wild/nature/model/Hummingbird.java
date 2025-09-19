package org.wild.nature.model;

import org.wild.nature.enums.AnimalActivity;

public class Hummingbird extends Animal {

    public Hummingbird(String number) {
        super("Колибри " + number);
        availableActivities = new AnimalActivity[]{
                AnimalActivity.FLYING,
                AnimalActivity.EATING,
                AnimalActivity.SLEEPING,
        };
    }
}
