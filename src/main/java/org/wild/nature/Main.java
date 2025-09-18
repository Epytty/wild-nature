package org.wild.nature;

import org.wild.nature.classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.addAll(addAnimals(Duck::new, 4));
        animals.addAll(addAnimals(Hummingbird::new, 7));
        animals.addAll(addAnimals(Bear::new, 3));
        animals.addAll(addAnimals(Wolf::new, 5));
        animals.addAll(addAnimals(Peacock::new, 1));
        animals.addAll(addAnimals(Beaver::new, 2));
        animals.addAll(addAnimals(Fish::new, 3));

        updateAnimalsThreads(animals);
        for (int i = 0; i < 10; i++) {
            printAnimalsTable(animals);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        interruptAnimalsThreads(animals);
    }

    private static <T extends Animal> List<T> addAnimals(Function<String, T> constructor, int count) {
        List<T> animals = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            animals.add(constructor.apply(String.valueOf(i)));
        }
        return animals;
    }

    private static void printAnimalsTable(List<Animal> animals) {
        String table = "| %-12s | %-12s |%n";
        System.out.format("-------------------------------%n");
        System.out.format(table, "Животное",  "Занятие");
        System.out.format("-------------------------------%n");
        animals.forEach(animal -> {
            System.out.format(table, animal, animal.getActivity().getDisplayValue());
            System.out.format("-------------------------------%n");
        });
    }

    private static List<Thread> updateAnimalsThreads(List<Animal> animals) {
        List<Thread> animalsThreads = new ArrayList<>();
        animals.forEach(animal -> {
            Thread thread = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    animal.setRandomActivity();
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(2000, 4000));
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

    private static void interruptAnimalsThreads(List<Animal> animals) {
        updateAnimalsThreads(animals).forEach(Thread::interrupt);
    }
}