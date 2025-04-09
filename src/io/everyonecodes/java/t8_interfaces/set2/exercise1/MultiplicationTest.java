package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplicationTest {
    private final Operator operator = new Multiplication();

    @ParameterizedTest
    @CsvSource({
            "2, 3, 6",
            "0, 5, 0",
            "-2, 3, -6",
            "-2, -3, 6",
            "1.5, 2.0, 3.0"
    })
    void testOperate(double a, double b, double expected) {
        double result = operator.operate(a, b);
        assertEquals(expected, result, 0.0001);
    }
}