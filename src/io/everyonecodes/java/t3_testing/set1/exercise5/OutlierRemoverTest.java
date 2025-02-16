package io.everyonecodes.java.t3_testing.set1.exercise5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OutlierRemoverTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void testRemoveOutliers(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, OutlierRemover.removeOutliers(input));
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(3, 5, 1, 3, 9), List.of(3, 5, 3)),
                Arguments.of(List.of(3, 5, 1, 3, 9, 1), List.of(3, 5, 3, 1)),
                Arguments.of(List.of(1, 1, 1), List.of(1)),
                Arguments.of(List.of(1, 3), List.of(1, 3)),
                Arguments.of(List.of(6), List.of(6)),
                Arguments.of(List.of(1, 5, 3), List.of(3))
        );
    }
}
