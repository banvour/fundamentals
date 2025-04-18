package io.everyonecodes.java.t9_inheritance.set2.exercise2.claims;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.InsuredPerson;

import java.util.List;

public class VehicleAccidentClaim extends Claim {
    private final List<String> licensePlates;

    public VehicleAccidentClaim(InsuredPerson insuredPerson, double estimatedCost, List<String> licensePlates) {
        super(insuredPerson, estimatedCost);
        this.licensePlates = licensePlates;
    }

    public List<String> getLicensePlates() {
        return licensePlates;
    }

    @Override
    public String generateReport() {
        return "Report for: " + getInsuredPerson().getFirstName() + " " + getInsuredPerson().getLastName() +
        ", policy number " + getInsuredPerson().getPolicyNumber() + "\n" +
                "    Estimated cost of damages: " + getEstimatedCost() + "\n" +
                "    This is a vehicle accident. License plates of involved vehicles: " + licensePlates;
    }
}
