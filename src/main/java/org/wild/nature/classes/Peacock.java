package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.Eating;
import org.wild.nature.interfaces.Flying;
import org.wild.nature.interfaces.Sleeping;
import org.wild.nature.interfaces.Walking;

public class Peacock extends Animal implements Flying, Walking, Eating, Sleeping {

    public Peacock(String number) {
        super("Павлин " + number);
        addActivity();
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
                this::eat, this::fly, this::sleep, this::walk
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
    public void walk() {
        setActivity(AnimalActivity.WALKING);
    }
}
