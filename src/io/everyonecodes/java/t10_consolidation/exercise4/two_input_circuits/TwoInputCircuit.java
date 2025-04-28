package io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public abstract class TwoInputCircuit implements CircuitElement {
    protected final CircuitElement input1;
    protected final CircuitElement input2;

    public TwoInputCircuit(CircuitElement input1, CircuitElement input2) {
        this.input1 = input1;
        this.input2 = input2;
    }
}
