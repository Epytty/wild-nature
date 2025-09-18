package org.wild.nature.classes;

import lombok.Setter;
import org.wild.nature.enums.AnimalActivity;
import org.wild.nature.interfaces.*;

@Setter
public class Bear extends Animal implements Walking, Swimming, Hunting, Eating, Sleeping {

    public Bear(String number) {
        super("Медведь " + number);

        addActivity();
    }

    @Override
    public Runnable[] getAvailableActivities() {
        return new Runnable[] {
            this::eat, this::hunt, this::sleep, this::swim, this::swim
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
