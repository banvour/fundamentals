package io.everyonecodes.java.t3_testing.review.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class DoubleListSumCalculatorTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(double expected, List<Double> input) {
        DoubleListSumCalculator doubleListSumCalculator = new DoubleListSumCalculator();

        double result = doubleListSumCalculator.calculate(input);

        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(3.0, List.of(1.0, 1.0, 1.0)),
                Arguments.of(0.0, List.of()),
                Arguments.of(10.0, List.of(10.0))
        );
    }
}