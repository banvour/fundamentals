package io.everyonecodes.java.t10_consolidation.exercise4;

import io.everyonecodes.java.t10_consolidation.exercise4.constants.False;
import io.everyonecodes.java.t10_consolidation.exercise4.constants.True;
import io.everyonecodes.java.t10_consolidation.exercise4.one_input_circuits.NotGate;
import io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits.AndGate;
import io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits.NandGate;
import io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits.NorGate;
import io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits.XorGate;

public class Application {
    public static void main(String[] args) {
        firstCircuit();
        secondCircuit();
        thirdCircuit();
    }

    private static void firstCircuit() {
        CircuitElement nand = new NandGate(new True(), new False());
        CircuitElement not = new NotGate(new False());
        CircuitElement circuit = new NorGate(nand, not);

        printResult(circuit);
    }

    private static void secondCircuit() {
        CircuitElement and1 = new AndGate(new True(), new True());
        CircuitElement and2 = new AndGate(new True(), new True());
        CircuitElement circuit = new AndGate(and1, and2);

        printResult(circuit);
    }

    private static void thirdCircuit() {
        CircuitElement nand = new NandGate(new True(), new False());
        CircuitElement not1 = new NotGate(new False());
        CircuitElement not2 = new NotGate(new False());
        CircuitElement and = new AndGate(not1, not2);
        CircuitElement circuit = new XorGate(nand, and);

        printResult(circuit);
    }

    private static void printResult(CircuitElement element) {
        System.out.println("Evaluates to: " + element.evaluate());
        System.out.println("Representation: " + element.circuitRepresentation());
    }
}
