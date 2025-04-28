package io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public class NorGate extends TwoInputCircuit {
    public NorGate(CircuitElement input1, CircuitElement input2) {
        super(input1, input2);
    }

    @Override
    public boolean evaluate() {
        return !(input1.evaluate() || input2.evaluate());
    }

    @Override
    public String circuitRepresentation() {
        return "NOR(" + input1.circuitRepresentation() + "," + input2.circuitRepresentation() + ")";
    }
}
