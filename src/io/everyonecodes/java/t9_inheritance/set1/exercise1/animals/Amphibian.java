package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public class Amphibian extends Animal {
    private final boolean hasLegs;

    public Amphibian(String species, List<String> movementTypes, boolean hasLegs) {
        super(species, movementTypes);
        this.hasLegs = hasLegs;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", has legs? " + hasLegs;
    }
}
