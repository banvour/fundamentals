package io.everyonecodes.java.t10_consolidation.exercise4.one_input_circuits;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;
import io.everyonecodes.java.t10_consolidation.exercise4.constants.False;
import io.everyonecodes.java.t10_consolidation.exercise4.constants.True;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OneInputCircuitTest {

    @ParameterizedTest
    @CsvSource({
            "true, false, NOT(TRUE)",
            "false, true, NOT(FALSE)"
    })
    void testNotGate(boolean inputValue, boolean expectedValue, String expectedRepresentation) {
        CircuitElement input = inputValue ? new True() : new False();
        CircuitElement notGate = new NotGate(input);

        assertEquals(expectedValue, notGate.evaluate());
        assertEquals(expectedRepresentation, notGate.circuitRepresentation());
    }
}