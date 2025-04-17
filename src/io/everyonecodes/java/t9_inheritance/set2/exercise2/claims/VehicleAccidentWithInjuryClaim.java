package io.everyonecodes.java.t9_inheritance.set2.exercise2.claims;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.InsuredPerson;

import java.util.List;

public class VehicleAccidentWithInjuryClaim extends VehicleAccidentClaim {
    private final int numberOfDeaths;

    public VehicleAccidentWithInjuryClaim(InsuredPerson insuredPerson, double estimatedCost, List<String> licensePlates, int numberOfDeaths) {
        super(insuredPerson, estimatedCost, licensePlates);
        this.numberOfDeaths = numberOfDeaths;
    }

    public int getNumberOfDeaths() {
        return numberOfDeaths;
    }

    @Override
    public String generateReport() {
        String report = super.generateReport();
        report += "\n    Unfortunately, some people were injured in this accident." +
                "Number of people who died in the accident: " + numberOfDeaths;
        return report;
    }
}
