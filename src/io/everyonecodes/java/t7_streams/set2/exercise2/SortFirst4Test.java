package io.everyonecodes.java.t7_streams.set2.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SortFirst4Test {

    @Test
    void test() {
        List<Integer> nums = List.of(-2, -1, 5, 2, -5, 4);
        List<Integer> expected = List.of(-5, -2, -1, 2);

        List<Integer> result = nums.stream()
                .sorted()
                .limit(4)
                .toList();

        Assertions.assertEquals(expected, result);
    }
}
