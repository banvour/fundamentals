package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public class Mammal extends Animal {
    private final String hairColor;

    public Mammal(String species, List<String> movementTypes, String hairColor) {
        super(species, movementTypes);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hair Color: " + hairColor;
    }
}
