package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.Eating;
import org.wild.nature.interfaces.Flying;
import org.wild.nature.interfaces.Sleeping;

public class Hummingbird extends Animal implements Flying, Eating, Sleeping {

    public Hummingbird(String number) {
        super("Колибри " + number);
        addActivity();
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
                this::eat, this::fly, this::sleep
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
}
