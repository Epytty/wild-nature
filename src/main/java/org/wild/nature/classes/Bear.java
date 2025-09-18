package org.wild.nature.classes;

import lombok.Setter;
import org.wild.nature.enums.AnimalActivity;

@Setter
public class Bear extends Animal {

    public Bear(String number) {
        super("Медведь " + number);

        availableActivities = new AnimalActivity[]{
                AnimalActivity.EATING,
                AnimalActivity.HUNTING,
                AnimalActivity.SLEEPING,
                AnimalActivity.WALKING,
                AnimalActivity.SWIMMING
        };

        setRandomActivity();
    }
}
