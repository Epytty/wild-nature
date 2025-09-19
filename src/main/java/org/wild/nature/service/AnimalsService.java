package org.wild.nature.service;

import org.wild.nature.model.Animal;

import java.util.List;
import java.util.function.Function;

public interface AnimalsService {

    <T extends Animal> List<T> addAnimals(Function<String, T> constructor, int count);
    List<Animal> createAnimals();
    void printAnimalsTable(List<Animal> animals);
    List<Thread> updateAnimalsThreads(List<Animal> animals);
    void interruptAnimalsThreads(List<Thread> animalsThreads);
}
