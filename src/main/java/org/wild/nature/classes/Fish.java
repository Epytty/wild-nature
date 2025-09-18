package org.wild.nature.classes;

import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.Eating;
import org.wild.nature.interfaces.Sleeping;
import org.wild.nature.interfaces.Swimming;

public class Fish extends Animal implements Swimming, Eating, Sleeping {

    public Fish(String number) {
        super("Рыба " + number);
        addActivity();
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
                this::eat, this::sleep, this::swim
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
}
