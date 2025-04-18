package io.everyonecodes.java.t9_inheritance.lecture.exercise1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("brand1"));
        vehicles.add(new Car("brand car", 2));
        vehicles.add(new Motorcycle("brand vrom", true));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getBrand());
        }
    }
}
