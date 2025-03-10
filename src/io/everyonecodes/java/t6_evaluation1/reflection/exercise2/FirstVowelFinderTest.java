package io.everyonecodes.java.t6_evaluation1.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

class FirstVowelFinderTest {

    private final FirstVowelFinder finder = new FirstVowelFinder();

    @ParameterizedTest
    @CsvSource({
            "aeiou, a",
            "aaa, a",
    })
    void count(String input, char expected) {
        Optional<Character> result = finder.find(input);
        Assertions.assertEquals(Optional.of(expected), result);
    }

    @Test
    void count_testEmpty() {
        var result = finder.find("");
        Assertions.assertEquals(Optional.empty(), result);
    }
}
