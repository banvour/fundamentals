package io.everyonecodes.java.t7b_datastructures.maps.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListElementCounterTest {

    @ParameterizedTest
    @MethodSource("countNumbersTestCases")
    void testCountNumbers(List<Integer> input, Map<Integer, Integer> expected) {
        ListElementCounter counter = new ListElementCounter();
        Map<Integer, Integer> actual = counter.countNumbers(input);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> countNumbersTestCases() {
        return Stream.of(
                Arguments.of(List.of(1), Map.of(1, 1)),
                Arguments.of(List.of(1, 1, 1), Map.of(1, 3)),
                Arguments.of(List.of(1, 1, 1, 2, 2, 4), Map.of(1, 3, 2, 2, 4, 1)),
                Arguments.of(List.of(), new HashMap<Integer, Integer>())
        );
    }


    @ParameterizedTest
    @MethodSource("countWordsTestCases")
    void testCountWords(List<String> input, Map<String, Integer> expected) {
        ListElementCounter counter = new ListElementCounter();
        Map<String, Integer> actual = counter.countWords(input);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> countWordsTestCases() {
        return Stream.of(
                Arguments.of(List.of("hi"), Map.of("hi", 1)),
                Arguments.of(List.of("hi", "hi", "hi"), Map.of("hi", 3)),
                Arguments.of(List.of("hi", "hi", "hi", "hey", "hey", "hello"),
                        Map.of("hi", 3, "hey", 2, "hello", 1)),
                Arguments.of(List.of(), new HashMap<String, Integer>())
        );
    }
}
