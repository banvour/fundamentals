package io.everyonecodes.java.t10_consolidation.exercise4.one_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public class NotGate extends OneInputCircuit{
    public NotGate(CircuitElement circuitElement) {
        super(circuitElement);
    }

    @Override
    public boolean evaluate() {
        return !circuitElement.evaluate();
    }

    @Override
    public String circuitRepresentation() {
        return "NOT(" + circuitElement.circuitRepresentation() + ")";
    }
}
