package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.*;

public class Duck extends Animal implements Walking, Flying, Swimming, Eating, Sleeping {

    public Duck(String number) {
        super("Утка " + number);
        addActivity();
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
                this::eat, this::fly, this::sleep, this::swim, this::walk
        };
    }

    @Override
    public void eat() {
        setActivity(AnimalActivity.EATING);
    }

    @Override
    public void fly() {
        setActivity(AnimalActivity.FLYING);
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
