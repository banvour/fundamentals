package io.everyonecodes.java.t9_inheritance.set1.exercise1.animals;

import java.util.List;

public class Arthropod extends Animal {
    private final int legAmount;

    public Arthropod(String species, List<String> movementTypes, int legAmount) {
        super(species, movementTypes);
        this.legAmount = legAmount;
    }

    public int getLegAmount() {
        return legAmount;
    }

    @Override
    public String toString() {
        return super.toString() + ", leg amount: " + legAmount;
    }
}
