package io.everyonecodes.java.t9_inheritance.set1.exercise1;

import io.everyonecodes.java.t9_inheritance.set1.exercise1.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalFinder {
    public List<Animal> findAnimalsWithMovement(List<Animal> animals, String movement) {
        List<Animal> animalsWithMovement = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal.getMovementTypes().contains(movement)) {
                animalsWithMovement.add(animal);
            }
        }

        return animalsWithMovement;
    }
}
