package io.everyonecodes.java.t10_consolidation.exercise4.one_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public abstract class OneInputCircuit implements CircuitElement {
    protected final CircuitElement circuitElement;

    public OneInputCircuit(CircuitElement circuitElement) {
        this.circuitElement = circuitElement;
    }
}
