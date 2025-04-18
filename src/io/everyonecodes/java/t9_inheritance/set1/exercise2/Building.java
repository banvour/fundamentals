package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class Building {
    private final String id;
    private final String city;
    private final double totalCost;
    private final int yearOfConstruction;

    public Building(String id, String city, double totalCost, int yearOfConstruction) {
        this.id = id;
        this.city = city;
        this.totalCost = totalCost;
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }
}