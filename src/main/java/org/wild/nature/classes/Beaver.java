package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.Eating;
import org.wild.nature.interfaces.Sleeping;
import org.wild.nature.interfaces.Swimming;
import org.wild.nature.interfaces.Walking;

public class Beaver extends Animal implements Walking, Swimming, Eating, Sleeping {

    public Beaver(String number) {
        super("Бобёр " + number);
        addActivity();
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
                this::eat, this::sleep, this::swim, this::walk
        };
    }

    @Override
    public void eat() {
        setActivity(AnimalActivity.EATING);
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
