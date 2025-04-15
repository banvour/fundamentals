package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public class Bird extends Animal {
    private final String featherColor;

    public Bird(String species, List<String> movementTypes, String featherColor) {
        super(species, movementTypes);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather Color: " + featherColor;
    }
}
