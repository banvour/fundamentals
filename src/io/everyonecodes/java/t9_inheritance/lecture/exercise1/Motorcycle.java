package io.everyonecodes.java.t9_inheritance.lecture.exercise1;

public class Motorcycle extends  Vehicle {
    private final boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }
}
