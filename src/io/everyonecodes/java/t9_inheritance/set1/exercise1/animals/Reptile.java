package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public class Reptile extends Animal {
    private final boolean hasShell;

    public Reptile(String species, List<String> movementTypes, boolean hasShell) {
        super(species, movementTypes);
        this.hasShell = hasShell;
    }

    public boolean isHasShell() {
        return hasShell;
    }

    @Override
    public String toString() {
        return super.toString() + ", has shell? " + hasShell;
    }
}
