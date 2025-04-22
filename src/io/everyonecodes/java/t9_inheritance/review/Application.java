package io.everyonecodes.java.t9_inheritance.review;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Garage garage = new Garage();

        garage.addVehicle(new Motorcycle("BMW", 2, 15.0,  9.0, true));
        garage.addVehicle(new Motorcycle("KTM", 1, 12.0,  6.0, false));

        garage.addVehicle(new SportsCar("Ferrari", 2, 80.0, 40.0, 2, true));
        garage.addVehicle(new SportsCar("Porsche", 2, 70.0, 20.0, 2, false));

        garage.addVehicle(new Limousine(
                "Rolls-Royce", 4, 100.0, 50.0, List.of("Tequila", "Vodka")
        ));
        garage.addVehicle(new Limousine(
                "Mercedes",   4,  90.0, 45.0, List.of("Jack Daniels", "Brandy")
        ));

        garage.refuelAll();
    }
}
