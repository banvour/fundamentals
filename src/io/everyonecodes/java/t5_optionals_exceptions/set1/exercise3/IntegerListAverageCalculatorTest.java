package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class IntegerListAverageCalculatorTest {

    private final IntegerListAverageCalculator averageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculate_testEmpty() {
        Assertions.assertTrue(averageCalculator.calculate(List.of()).isEmpty());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(List<Integer> input, double expected) {
        Optional<Double> result = averageCalculator.calculate(input);

        Assertions.assertEquals(Optional.of(expected), result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4), "2.5"),
                Arguments.of(List.of(10, 20, 30), "20")
        );
    }
}
