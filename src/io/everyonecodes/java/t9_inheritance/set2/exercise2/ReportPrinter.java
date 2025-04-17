package io.everyonecodes.java.t9_inheritance.set2.exercise2;

import io.everyonecodes.java.t9_inheritance.set2.exercise2.claims.Claim;

import java.util.List;

public class ReportPrinter {
    public void printReports(List<Claim> claims) {
        for (Claim claim : claims) {
            System.out.println(claim.generateReport());
        }
    }
}
