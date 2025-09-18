package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.*;

public class Wolf extends Animal implements Walking, Swimming, Hunting, Eating, Sleeping {

    public Wolf(String number) {
        super("Волк " + number);
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
                this::eat, this::hunt, this::sleep, this::swim, this::walk
        };
    }

    @Override
    public void eat() {
        setActivity(AnimalActivity.EATING);
    }

    @Override
    public void hunt() {
        setActivity(AnimalActivity.HUNTING);
    }

    @Override
    public void sleep() {
        setActivity(AnimalActivity.SLEEPING);
    }

    @Override
    public void swim() {
        setActivity(AnimalActivity.SWIMMING);
    }

    @Override
    public void walk() {
        setActivity(AnimalActivity.WALKING);
    }
}
