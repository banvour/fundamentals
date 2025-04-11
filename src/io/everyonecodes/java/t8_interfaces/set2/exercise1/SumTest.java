package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SumTest {
    private final Operator operator = new Sum();

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "0, 0, 0",
            "-5, 5, 0",
            "1.5, 2.5, 4.0",
            "1000, 2000, 3000"
    })
    void testOperate(double a, double b, double expected) {
        double result = operator.operate(a, b);
        assertEquals(expected, result, 0.0001);
    }
}