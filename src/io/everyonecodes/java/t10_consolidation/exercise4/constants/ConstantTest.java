package io.everyonecodes.java.t10_consolidation.exercise4.constants;

import io.everyonecodes.java.t10_consolidation.exercise4.CircuitElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstantTest {

    @ParameterizedTest
    @CsvSource({
            "TRUE, true",
            "FALSE, false"
    })
    void testConstants(String expectedRepresentation, boolean expectedValue) {
        CircuitElement element = expectedValue ? new True() : new False();

        assertEquals(expectedValue, element.evaluate());
        assertEquals(expectedRepresentation, element.circuitRepresentation());
    }
}