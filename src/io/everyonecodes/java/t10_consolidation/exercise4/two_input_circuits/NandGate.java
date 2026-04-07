package io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;

public class NandGate extends TwoInputCircuit {
    public NandGate(CircuitElement input1, CircuitElement input2) {
        super(input1, input2);
    }

    @Override
    public boolean evaluate() {
        return !(input1.evaluate() && input2.evaluate());
    }

    @Override
    public String circuitRepresentation() {
        return "NAND(" + input1.circuitRepresentation() + "," + input2.circuitRepresentation() + ")";
    }
}
