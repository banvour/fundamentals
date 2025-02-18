package io.everyonecodes.java.t3_testing.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class ValueCounterTest {
    ValueCounter counter = new ValueCounter();

    @ParameterizedTest
    @MethodSource("parameters")
    void countTrueValues(List<Boolean> input, int expected) {
        int result = counter.countTrueValues(input);

        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(false, true, false, true), 2),
                Arguments.of(List.of(true, true, false, true), 3),
                Arguments.of(List.of(false, false), 0),
                Arguments.of(List.of(true), 1)
        );
    }
}
