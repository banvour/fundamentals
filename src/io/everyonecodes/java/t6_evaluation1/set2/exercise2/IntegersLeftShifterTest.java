package io.everyonecodes.java.t6_evaluation1.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class IntegersLeftShifterTest {

    private final IntegersLeftShifter shifter = new IntegersLeftShifter();

    @ParameterizedTest
    @MethodSource("parameters")
    void testShiftOne(List<Integer> input, List<Integer> expected) {
        List<Integer> result = shifter.shiftOne(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5), List.of(2, 3, 4, 5, 1)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(42), List.of(42))
        );
    }
}
