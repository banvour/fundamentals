package io.everyonecodes.java.t9_inheritance.review;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public void refuelAll() {
        for (Vehicle v : vehicles) {
            v.refuel();
        }
    }
}
