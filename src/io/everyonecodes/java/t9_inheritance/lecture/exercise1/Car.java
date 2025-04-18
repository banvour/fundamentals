package io.everyonecodes.java.t9_inheritance.lecture.exercise1;

public class Car extends  Vehicle {
    private final int numOfDoors;

    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }
}
