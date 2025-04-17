package io.everyonecodes.java.t9_inheritance.set2.exercise2;

public class InsuredPerson {
    private final String firstName;
    private final String lastName;
    private final String ssn;
    private final int policyNumber;

    public InsuredPerson(String firstName, String lastName, String ssn, int policyNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.policyNumber = policyNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }
}
