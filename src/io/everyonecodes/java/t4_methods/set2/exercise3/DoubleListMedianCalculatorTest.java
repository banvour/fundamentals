package io.everyonecodes.java.t4_methods.set2.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleListMedianCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideListsForMedianCalculation")
    void calculate(List<Double> input, double expected) {
        DoubleListMedianCalculator calculator = new DoubleListMedianCalculator();
        assertEquals(expected, calculator.calculate(input), 0.0001);
    }

    static Stream<Arguments> provideListsForMedianCalculation() {
        return Stream.of(
                Arguments.of(List.of(1.0, 3.0, 2.0), 2.0),
                Arguments.of(List.of(5.0, 10.0, 15.0, 20.0), 12.5),
                Arguments.of(List.of(7.0), 7.0),
                Arguments.of(List.of(3.0, 3.0, 3.0), 3.0),
                Arguments.of(List.of(2.5, 1.5, 3.5, 4.5, 5.5), 3.5),
                Arguments.of(List.of(9.0, 3.0, 6.0, 1.0, 8.0, 7.0), 6.5)
        );
    }
}
