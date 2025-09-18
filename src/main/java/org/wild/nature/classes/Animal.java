package org.wild.nature.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.wild.nature.enums.AnimalActivity;

@Getter
@Setter
@AllArgsConstructor
public abstract class Animal {

    private final String type ;
    private AnimalActivity activity;

    public Animal(String type) {
        this.type = type;
        addActivity();
    }

    @Override
    public String toString() {
        return type;
    }

    public abstract Runnable[] getAvailableActivities();

    public void addActivity() {
        Runnable[] actvities = getAvailableActivities();
        actvities[(int)(Math.random() * actvities.length)].run();
    }
}
