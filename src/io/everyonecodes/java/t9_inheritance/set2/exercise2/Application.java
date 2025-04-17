package io.everyonecodes.java.t9_inheritance.set2.exercise2;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.claims.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InsuredPerson john = new InsuredPerson("John", "Smith", "123456789", 5678);

        Claim fire = new FireDamageClaim(john, 6000.0,
                List.of("tv", "microwave", "piano", "couch"),
                true, "defect in wall socket");

        Claim tornado = new TornadoDamageClaim(john, 12000.0,
                List.of("kitchen table", "bookshelf", "desk", "bed"),
                true);

        Claim vehicle = new VehicleAccidentClaim(john, 2000.0,
                List.of("W1234", "W8790"));

        Claim vehicleInjury = new VehicleAccidentWithInjuryClaim(john, 80000.0,
                List.of("W9445", "W3049"), 2);

        List<Claim> claims = List.of(fire, tornado, vehicle, vehicleInjury);

        ReportPrinter printer = new ReportPrinter();
        printer.printReports(claims);
    }
}
