package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class Mansion extends Building {
    private boolean hasJacuzzi;
    private double gardenSize;

    public Mansion(String id, String city, double totalCost, int yearOfConstruction, boolean hasJacuzzi, double gardenSize) {
        super(id, city, totalCost, yearOfConstruction);
        this.hasJacuzzi = hasJacuzzi;
        this.gardenSize = gardenSize;
    }

    public boolean hasJacuzzi() {
        return hasJacuzzi;
    }

    public double getGardenSize() {
        return gardenSize;
    }
}
