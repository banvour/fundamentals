package io.everyonecodes.java.t10_consolidation.exercise4.constants;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public abstract class Constant implements CircuitElement {
    private final boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }
}
