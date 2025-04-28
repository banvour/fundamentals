package io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public class AndGate extends TwoInputCircuit {
    public AndGate(CircuitElement input1, CircuitElement input2) {
        super(input1, input2);
    }

    @Override
    public boolean evaluate() {
        return input1.evaluate() && input2.evaluate();
    }

    @Override
    public String circuitRepresentation() {
        return "AND(" + input1.circuitRepresentation() + "," + input2.circuitRepresentation() + ")";
    }
}
