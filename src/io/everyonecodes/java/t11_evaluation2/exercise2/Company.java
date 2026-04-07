package io.everyonecodes.java.t11_evaluation2.exercise2;

public class Company {
    private final String name;
    private final String slogan;

    public Company(String name, String slogan) {
        this.name = name;
        this.slogan = slogan;
    }

    public String getName() {
        return name;
    }

    public String getSlogan() {
        return slogan;
    }
}