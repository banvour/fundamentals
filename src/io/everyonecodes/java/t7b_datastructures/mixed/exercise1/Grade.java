package io.everyonecodes.java.t7b_datastructures.mixed.exercise1;

public enum Grade {
    VERY_GOOD(1),
    GOOD(2),
    SATISFACTORY(3),
    ADEQUATE(4),
    UNSATISFACTORY(5);

    private final int number;

    Grade(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
