package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class StringOverlapFinderTest {

    private final StringOverlapFinder overlapFinder = new StringOverlapFinder();

    @ParameterizedTest
    @MethodSource("parameters")
    void find(String input, String input2, String expected) {
        Optional<String> result = overlapFinder.find(input, input2);
        Assertions.assertEquals(Optional.of(expected), result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("michael", "elias", "el"),
                Arguments.of("jimbo", "otto", "o")
        );
    }

    @Test
    void find_NoOverlap() {
        Assertions.assertTrue(overlapFinder.find("matilda", "mugatu").isEmpty());
    }

    @Test
    void find_EmptyString() {
        Assertions.assertTrue(overlapFinder.find("jimbo", "''").isEmpty());
    }
}
