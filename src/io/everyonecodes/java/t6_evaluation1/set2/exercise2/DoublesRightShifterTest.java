package io.everyonecodes.java.t6_evaluation1.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class DoublesRightShifterTest {

    private final DoublesRightShifter shifter = new DoublesRightShifter();

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(1.1, 2.2, 3.3, 4.4, 5.5), List.of(4.4, 5.5, 1.1, 2.2, 3.3)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(9.9), List.of(9.9))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testShiftTwo(List<Double> input, List<Double> expected) {
        List<Double> result = shifter.shiftTwo(input);
        Assertions.assertEquals(expected, result);
    }
}
