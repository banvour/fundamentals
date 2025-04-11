package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DivisionTest {
    private final Operator operator = new Division();

    @ParameterizedTest
    @MethodSource("provideDivisionTestCases")
    void testOperate(double a, double b, double expected) {
        double result = operator.operate(a, b);
        if (Double.isInfinite(expected)) {
            assertEquals(expected, result);
        } else {
            assertEquals(expected, result, 0.0001);
        }
    }

    static Stream<Arguments> provideDivisionTestCases() {
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(-10, 2, -5),
                Arguments.of(3, 0, Double.POSITIVE_INFINITY)
                );
    }
}