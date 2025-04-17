package io.everyonecodes.java.t9_inheritance.set2.exercise2.claims;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.InsuredPerson;

import java.util.List;

public class TornadoDamageClaim extends HouseholdClaim {
    private final boolean isRoofDamaged;

    public TornadoDamageClaim(InsuredPerson insuredPerson, double estimatedCost, List<String> damagedItems, boolean isRoofDamaged) {
        super(insuredPerson, estimatedCost, damagedItems);
        this.isRoofDamaged = isRoofDamaged;
    }

    public boolean isRoofDamaged() {
        return isRoofDamaged;
    }

    @Override
    public String generateReport() {
        String report = super.generateReport();
        report += "    This is a tornado damage claim. \n";
        if (isRoofDamaged) {
            report += "    Since the roof was damaged, make sure to buy some buckets to prevent future water damage claims.";
        }
        return report;
    }
}
