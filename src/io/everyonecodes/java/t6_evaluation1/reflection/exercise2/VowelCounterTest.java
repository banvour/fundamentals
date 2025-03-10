package io.everyonecodes.java.t6_evaluation1.reflection.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VowelCounterTest {

    private final VowelCounter counter = new VowelCounter();

    @ParameterizedTest
    @CsvSource({
            "aeiou, 5",
            "aaa, 3",
            "'', 0"
    })
    void count(String input, int expected) {
        int result = counter.count(input);
        Assertions.assertEquals(expected, result);
    }
}
