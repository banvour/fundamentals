package io.everyonecodes.java.t7b_datastructures.sets.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class SetCreatorTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void testGetDistinctNumbers(List<Integer> list1, List<Integer> list2, Set<Integer> expected) {
        SetCreator setCreator = new SetCreator();
        Set<Integer> result = setCreator.getDistinctNumbers(list1, list2);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(), List.of(), new HashSet<Integer>()),
                Arguments.of(List.of(1), List.of(2), new HashSet<>(List.of(1, 2))),
                Arguments.of(List.of(), List.of(4, 5, 6), new HashSet<>(List.of(4, 5, 6))),
                Arguments.of(List.of(1, 2, 3), List.of(3, 4, 5), new HashSet<>(List.of(1, 2, 3, 4, 5))),
                Arguments.of(List.of(1, 1, 2, 2), List.of(2, 2, 3, 3), new HashSet<>(List.of(1, 2, 3)))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters2")
    void testGetCommonNumbers(List<Integer> list1, List<Integer> list2, Set<Integer> expected) {
        SetCreator setCreator = new SetCreator();
        Set<Integer> result = setCreator.getCommonNumbers(list1, list2);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters2() {
        return Stream.of(
                Arguments.of(List.of(), List.of(), new HashSet<Integer>()),
                Arguments.of(List.of(1, 2, 3), List.of(), new HashSet<Integer>()),
                Arguments.of(List.of(), List.of(4, 5, 6), new HashSet<Integer>()),
                Arguments.of(List.of(1, 2), List.of(2, 3), new HashSet<>(List.of(2))),
                Arguments.of(List.of(1, 1, 1, 2), List.of(2, 2, 3), new HashSet<>(List.of(2))),
                Arguments.of(List.of(1, 2, 3), List.of(4, 3, 2, 1), new HashSet<>(List.of(1, 2, 3)))
        );
    }
}
