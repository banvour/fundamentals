package io.everyonecodes.java.t7b_datastructures.sets.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerListDuplicateRemoverTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testRemoveDuplicates(List<Integer> input, List<Integer> expected) {
        IntegerListDuplicateRemover remover = new IntegerListDuplicateRemover();
        List<Integer> result = remover.remove(input);

        Collections.sort(result);
        assertEquals(expected, result, "The sorted result list should match the expected list.");
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 2, 3), List.of(1, 2, 3)),
                Arguments.of(List.of(4, 4, 4, 4), List.of(4)),
                Arguments.of(List.of(), List.of()),
                Arguments.of(List.of(5, 6, 7, 8), List.of(5, 6, 7, 8)),
                Arguments.of(List.of(9, 10, 9, 10, 11), List.of(9, 10, 11))
        );
    }
}
