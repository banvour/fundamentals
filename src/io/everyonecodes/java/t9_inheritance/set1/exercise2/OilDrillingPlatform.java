package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class OilDrillingPlatform extends Building {
    private Drill drill;

    public OilDrillingPlatform(String id, String city, double totalCost, int yearOfConstruction, Drill drill) {
        super(id, city, totalCost, yearOfConstruction);
        this.drill = drill;
    }

    public Drill getDrill() {
        return drill;
    }
}
