package io.everyonecodes.java.t4_methods.set2.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleListFromMedianSubtractorTest {

    @ParameterizedTest
    @MethodSource("provideListsForCalculation")
    void calculate_shouldReturnDifferencesFromMedian(List<Double> input, List<Double> expected) {
        DoubleListFromMedianSubtractor subtractor = new DoubleListFromMedianSubtractor();
        assertEquals(expected, subtractor.calculate(input));
    }

    static Stream<Arguments> provideListsForCalculation() {
        return Stream.of(
                Arguments.of(List.of(1.0, 4.0, 2.0, 10.0, 11.5), List.of(-3.0, 0.0, -2.0, 6.0, 7.5)),
                Arguments.of(List.of(5.0, 10.0, 15.0), List.of(-5.0, 0.0, 5.0)),
                Arguments.of(List.of(7.0, 8.0, 9.0, 10.0), List.of(-1.5, -0.5, 0.5, 1.5)),
                Arguments.of(List.of(3.0, 3.0, 3.0), List.of(0.0, 0.0, 0.0)),
                Arguments.of(List.of(2.5), List.of(0.0)) // Single element
        );
    }
}