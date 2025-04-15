package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public abstract class Animal {
    private final String species;
    private final List<String> movementTypes;

    public Animal(String species, List<String> movementTypes) {
        this.species = species;
        this.movementTypes = movementTypes;
    }

    public String getSpecies() {
        return species;
    }

    public List<String> getMovementTypes() {
        return movementTypes;
    }

    @Override
    public String toString() {
        return "Species: " + species
                + ", Movement Types: " + movementTypes;
    }
}
