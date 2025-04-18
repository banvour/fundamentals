package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class Skyscraper extends  Building {
    private boolean hasHelipad;
    private int numberOfElevators;

    public Skyscraper(String id, String city, double totalCost, int yearOfConstruction, boolean hasHelipad, int numberOfElevators) {
        super(id, city, totalCost, yearOfConstruction);
        this.hasHelipad = hasHelipad;
        this.numberOfElevators = numberOfElevators;
    }

    public boolean hasHelipad() {
        return hasHelipad;
    }

    public int getNumberOfElevators() {
        return numberOfElevators;
    }
}
