package io.everyonecodes.java.t10_consolidation.exercise3;

public enum Color {
    RED("r"), GREEN("g"), YELLOW("y"), BLUE("b");
    private final String stringRepresentation;

    Color(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public String getStringRepresentation() {
        return stringRepresentation;
    }
}