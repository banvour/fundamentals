package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class DoubleListMaximumFinderTest {

    private final DoubleListMaximumFinder maximumFinder = new DoubleListMaximumFinder();

    @Test
    void find_EmptyList() {
        Assertions.assertTrue(maximumFinder.find(List.of()).isEmpty());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void find(List<Double> input, double expected) {
        Optional<Double> result = maximumFinder.find(input);
        Assertions.assertEquals(Optional.of(expected), result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
            Arguments.of(List.of(2.5, 2.0, 4.5), "4.5"),
            Arguments.of(List.of(0.0, 0.5, 0.4), "0.5")
        );
    }
}
