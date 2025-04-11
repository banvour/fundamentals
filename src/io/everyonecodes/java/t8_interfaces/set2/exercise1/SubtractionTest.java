package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SubtractionTest {
    private final Operator operator = new Subtraction();

    @ParameterizedTest
    @CsvSource({
            "5, 3, 2",
            "3, 5, -2",
            "0, 0, 0",
            "-5, -3, -2",
            "10.5, 2.5, 8.0"
    })
    void testOperate(double a, double b, double expected) {
        double result = operator.operate(a, b);
        assertEquals(expected, result, 0.0001);
    }
}