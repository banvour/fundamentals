package io.everyonecodes.java.t10_consolidation.exercise4.two_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;
import io.everyonecodes.java.t10_consolidation.exercise4.constants.False;
import io.everyonecodes.java.t10_consolidation.exercise4.constants.True;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TwoInputCircuitTest {

    @ParameterizedTest
    @MethodSource("gateTestCases")
    void testTwoInputGates(boolean input1Value, boolean input2Value, boolean expectedValue, String gateType) {
        CircuitElement input1 = input1Value ? new True() : new False();
        CircuitElement input2 = input2Value ? new True() : new False();
        CircuitElement gate = createGate(gateType, input1, input2);

        assertEquals(expectedValue, gate.evaluate(), gateType + " evaluate failed");
        assertTrue(gate.circuitRepresentation().startsWith(gateType + "("), gateType + " representation failed");
    }

    static Stream<Arguments> gateTestCases() {
        return Stream.of(
                Arguments.of(true, true, true, "AND"),
                Arguments.of(true, false, false, "AND"),
                Arguments.of(false, true, false, "AND"),
                Arguments.of(false, false, false, "AND"),

                Arguments.of(true, true, true, "OR"),
                Arguments.of(true, false, true, "OR"),
                Arguments.of(false, true, true, "OR"),
                Arguments.of(false, false, false, "OR"),

                Arguments.of(true, true, false, "NAND"),
                Arguments.of(true, false, true, "NAND"),
                Arguments.of(false, true, true, "NAND"),
                Arguments.of(false, false, true, "NAND"),

                Arguments.of(true, true, false, "NOR"),
                Arguments.of(true, false, false, "NOR"),
                Arguments.of(false, true, false, "NOR"),
                Arguments.of(false, false, true, "NOR"),

                Arguments.of(true, true, false, "XOR"),
                Arguments.of(true, false, true, "XOR"),
                Arguments.of(false, true, true, "XOR"),
                Arguments.of(false, false, false, "XOR")
        );
    }

    private CircuitElement createGate(String type, CircuitElement input1, CircuitElement input2) {
        return switch (type) {
            case "AND" -> new AndGate(input1, input2);
            case "OR" -> new OrGate(input1, input2);
            case "NAND" -> new NandGate(input1, input2);
            case "NOR" -> new NorGate(input1, input2);
            case "XOR" -> new XorGate(input1, input2);
            default -> throw new IllegalArgumentException("Unknown gate type: " + type);
        };
    }
}