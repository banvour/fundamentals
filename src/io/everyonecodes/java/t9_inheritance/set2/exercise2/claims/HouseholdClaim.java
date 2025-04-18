package io.everyonecodes.java.t9_inheritance.set2.exercise2.claims;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.InsuredPerson;

import java.util.List;

public class HouseholdClaim extends Claim {
    private final List<String> damagedItems;

    public HouseholdClaim(InsuredPerson insuredPerson, double estimatedCost, List<String> damagedItems) {
        super(insuredPerson, estimatedCost);
        this.damagedItems = damagedItems;
    }

    @Override
    public String generateReport() {
        return "Report for: " + getInsuredPerson().getFirstName() + " " + getInsuredPerson().getLastName()
                + ", policy number " + getInsuredPerson().getPolicyNumber() + "\n"
                + "    Estimated cost of damages: " + getEstimatedCost() + "\n"
                + "    This is a household claim.\n"
                + "    Damaged items: " + damagedItems;
    }
}
