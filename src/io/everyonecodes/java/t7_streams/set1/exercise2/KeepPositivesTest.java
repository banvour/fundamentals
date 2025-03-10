package io.everyonecodes.java.t7_streams.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class KeepPositivesTest {

    @Test
    void test() {
        List<Integer> wholeNumbers = List.of(-1, 0, 1, 2, 3);
        List<Integer> expectedNumbers = List.of(1, 2, 3);

        List<Integer> result = wholeNumbers
                .stream()
                .filter(number -> number > 0)
                .toList();

        Assertions.assertEquals(expectedNumbers, result);
    }
}
