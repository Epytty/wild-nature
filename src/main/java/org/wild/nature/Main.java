package org.wild.nature;

import org.wild.nature.model.Animal;
import org.wild.nature.service.ActivityService;
import org.wild.nature.service.AnimalsService;
import org.wild.nature.service.impl.ActivityServiceImpl;
import org.wild.nature.service.impl.AnimalsServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ActivityService activityService = new ActivityServiceImpl();
        AnimalsService animalsService = new AnimalsServiceImpl(activityService);

        List<Animal> animals = animalsService.createAnimals();
        List<Thread> animalsThreads = animalsService.updateAnimalsThreads(animals);

        for (int i = 0; i < 6; i++) {
            animalsService.printAnimalsTable(animals);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        animalsService.interruptAnimalsThreads(animalsThreads);
    }
}