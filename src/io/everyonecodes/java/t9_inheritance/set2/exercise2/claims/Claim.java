package io.everyonecodes.java.t9_inheritance.set2.exercise2.claims;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.InsuredPerson;

public abstract class Claim {
    private final InsuredPerson insuredPerson;
    private final double estimatedCost;

    public Claim(InsuredPerson insuredPerson, double estimatedCost) {
        this.insuredPerson = insuredPerson;
        this.estimatedCost = estimatedCost;
    }

    public InsuredPerson getInsuredPerson() {
        return insuredPerson;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }

    public abstract String generateReport();
}