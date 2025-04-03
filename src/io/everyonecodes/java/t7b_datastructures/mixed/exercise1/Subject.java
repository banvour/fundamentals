package io.everyonecodes.java.t7b_datastructures.mixed.exercise1;

public enum Subject {
    MATHS("maths"),
    ENGLISH("english"),
    GERMAN("german"),
    PSYCHOLOGY("psychology"),
    GEOGRAPHY("geography"),
    HISTORY("history");

    private final String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
