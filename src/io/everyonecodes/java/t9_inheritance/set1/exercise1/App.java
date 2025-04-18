package io.everyonecodes.java.t9_inheritance.set1.exercise1;

import io.everyonecodes.java.t9_inheritance.set1.exercise1.animals.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(
        new Mammal("cat", List.of("walk"), "orange"),
        new Bird("hawk", List.of("fly", "walk"), "brown"),
        new Fish("trout", List.of("swim"), "freshwater"),
        new Reptile("turtle", List.of("walk", "swim"), true),
        new Amphibian("frog", List.of("jump", "swim"), true),
        new Arthropod("spider", List.of("walk"), 8)
        ));

        AnimalFinder animalFinder = new AnimalFinder();
        System.out.println(animalFinder.findAnimalsWithMovement(animals, "fly"));
    }
}
