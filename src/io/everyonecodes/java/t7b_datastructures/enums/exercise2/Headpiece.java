package io.everyonecodes.java.t7b_datastructures.enums.exercise2;

public enum Headpiece {
    WARM("beanie"),
    LIGHT("hat");

    private final String description;

    Headpiece(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
