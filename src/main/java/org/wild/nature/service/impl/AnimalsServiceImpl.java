package org.wild.nature.service.impl;

import lombok.RequiredArgsConstructor;
import org.wild.nature.model.*;
import org.wild.nature.service.ActivityService;
import org.wild.nature.service.AnimalsService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@RequiredArgsConstructor
public class AnimalsServiceImpl implements AnimalsService {

    private final ActivityService activityService;

    @Override
    public <T extends Animal> List<T> addAnimals(Function<String, T> constructor, int count) {
        List<T> animals = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            animals.add(constructor.apply(String.valueOf(i)));
        }
        return animals;
    }

    @Override
    public List<Animal> createAnimals() {
        List<Animal> animals = new ArrayList<>();
        animals.addAll(addAnimals(Duck::new, 4));
        animals.addAll(addAnimals(Hummingbird::new, 7));
        animals.addAll(addAnimals(Bear::new, 3));
        animals.addAll(addAnimals(Wolf::new, 5));
        animals.addAll(addAnimals(Peacock::new, 1));
        animals.addAll(addAnimals(Beaver::new, 2));
        animals.addAll(addAnimals(Fish::new, 3));
        return animals;
    }

    @Override
    public void printAnimalsTable(List<Animal> animals) {
        String table = "| %-12s | %-12s | %-12s |%n";
        System.out.format("-------------------------------%n");
        System.out.format(table, "Животное",  "Занятие", "Прошлое занятие");
        System.out.format("-------------------------------%n");
        animals.forEach(animal -> {
            System.out.format(
                    table, animal,
                    animal.getActivity().getDisplayValue(),
                    activityService.getPreviousActivity(animal.getActivityHistory()).getDisplayValue());
            System.out.format("-------------------------------%n");
        });
    }

    @Override
    public List<Thread> updateAnimalsThreads(List<Animal> animals) {
        List<Thread> animalsThreads = new ArrayList<>();
        animals.forEach(animal -> {
            Thread thread = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    animal.updateActivity(activityService);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            thread.setDaemon(true);
            thread.start();
            animalsThreads.add(thread);
        });
        return animalsThreads;
    }

    @Override
    public void interruptAnimalsThreads(List<Thread> animalsThreads) {
        animalsThreads.forEach(Thread::interrupt);
    }
}
