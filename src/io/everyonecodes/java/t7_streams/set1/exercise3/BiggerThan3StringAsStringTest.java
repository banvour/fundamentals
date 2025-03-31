package io.everyonecodes.java.t7_streams.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class BiggerThan3StringAsStringTest {

    @Test
    void test() {
        List<Integer> wholeNumbers = List.of(0, 1, 2, 3, 4, 5);
        List<String> expectedNumbers = List.of("4", "5");

        List<String> result = wholeNumbers
                .stream()
                .filter(number -> number > 3)
                .map(String::valueOf)
                .toList();

        Assertions.assertEquals(expectedNumbers, result);
    }
}
