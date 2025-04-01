package io.everyonecodes.java.t7b_datastructures.lecture;

public enum Season {
    SPRING("spring"), SUMMER("summer"), AUTUMN("autumn"), WINTER("winter");

    private final String name;

    Season(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
