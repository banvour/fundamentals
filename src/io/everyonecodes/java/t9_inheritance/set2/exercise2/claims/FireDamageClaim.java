package io.everyonecodes.java.t9_inheritance.set2.exercise2.claims;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.InsuredPerson;

import java.util.List;

public class FireDamageClaim extends HouseholdClaim {
    private final boolean petsHarmed;
    private final String cause;

    public FireDamageClaim(InsuredPerson insuredPerson, double estimatedCost, List<String> damagedItems, boolean petsHarmed, String cause) {
        super(insuredPerson, estimatedCost, damagedItems);
        this.petsHarmed = petsHarmed;
        this.cause = cause;
    }

    public boolean isPetsHarmed() {
        return petsHarmed;
    }

    public String getCause() {
        return cause;
    }

    @Override
    public String generateReport() {
        String report = super.generateReport();
        report += "    This is a fire damage claim. The assumed cause of the fire is: " + cause + "\n";
        if (petsHarmed) {
            report += "    Since one or more pets were harmed, an additional bonus of 10€ will be awarded.";
        }
        return report;
    }
}
