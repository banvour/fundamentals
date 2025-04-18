package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public class Fish extends Animal {
    private final String waterType;

    public Fish(String species, List<String> movementTypes, String waterType) {
        super(species, movementTypes);
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }

    @Override
    public String toString() {
        return super.toString() + ", watertype: " + waterType;
    }
}
