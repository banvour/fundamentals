package io.everyonecodes.java.t6_evaluation1.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SpecialNumbersCounterTest {

    private final SpecialNumbersCounter counter = new SpecialNumbersCounter();

    @ParameterizedTest
    @CsvSource({
            "333, 3",
            "123, 1",
            "369, 3",
            "0, 0",
            "3, 1",
            "1245, 0",
            "-333, 3"
    })
    void count(String input, int expected) {
        int result = counter.count(input);
        Assertions.assertEquals(expected, result);
    }
}
