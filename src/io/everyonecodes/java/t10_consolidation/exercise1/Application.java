package io.everyonecodes.java.t10_consolidation.exercise1;

import io.everyonecodes.java.t10_consolidation.exercise1.vehicles.*;
import io.everyonecodes.java.t10_consolidation.exercise1.vehicles.publicTransport.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Vehicle> vehicles = List.of(
                new DieselCar(220, 5, "BMW i4", 80),
                new ElectricCar(240, 5, "Tesla Model S", 100),

                new Bus(
                        80, 50,
                        List.of(
                                new Station("Skodagasse", 48.21, 16.34),
                                new Station("Westbahnstrasse", 48.2, 16.34)
                        ),
                        true
                ),

                new DieselCar(160, 4, "VW Golf", 50),

                new Subway(
                        110, 350,
                        List.of(
                                new Station("Suedtiroler Platz", 48.18, 16.37),
                                new Station("Karlsplatz", 48.2, 16.36)
                        ),
                        7
                ),

                new Bus(
                        80, 50,
                        List.of(
                                new Station("Ziegelofengasse", 48.19, 16.36),
                                new Station("Hauptbahnhof", 48.18, 16.37)
                        ),
                        false
                ),

                new Subway(
                        110, 300,
                        List.of(
                                new Station("Donauinsel", 48.22, 16.36),
                                new Station("Leopoldau", 48.27, 16.43)
                        ),
                        6
                )
        );

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDescription());
            System.out.println();
        }
    }
}