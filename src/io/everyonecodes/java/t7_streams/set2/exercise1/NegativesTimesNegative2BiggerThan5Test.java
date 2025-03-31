package io.everyonecodes.java.t7_streams.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class NegativesTimesNegative2BiggerThan5Test {

    @Test
    void test() {
        List<Double> nums = new ArrayList<>(List.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6));

        long result = nums.stream()
                .filter(num -> num < 0)
                .map(num -> num * -2)
                .filter(num -> num > 5)
                .count();

        Assertions.assertEquals(2, result);
    }
}
