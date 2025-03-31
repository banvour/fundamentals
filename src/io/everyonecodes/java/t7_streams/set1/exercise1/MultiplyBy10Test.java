package io.everyonecodes.java.t7_streams.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MultiplyBy10Test {

    @Test
    void test() {
        List<Integer> wholeNumbers = List.of(-2, -1, 0, 1, 2);
        List<Integer> expectedNumbers = List.of(-20, -10, 0, 10, 20);

        List<Integer> result = wholeNumbers
                .stream()
                .map(number -> number * 10)
                .toList();

        Assertions.assertEquals(expectedNumbers,result);
    }
}

