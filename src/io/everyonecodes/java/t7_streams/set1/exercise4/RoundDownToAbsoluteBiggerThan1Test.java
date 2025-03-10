package io.everyonecodes.java.t7_streams.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

class RoundDownToAbsoluteBiggerThan1Test {

    @Test
    void test() {
        Stream<Double> nums = Stream.of(1.5, -1.8, 3.5);
        Optional<Double> expected = Optional.of(3.0);

        Optional<Double> result = nums.map(Math::floor).filter(number -> number > 1).findFirst();

        Assertions.assertEquals(expected, result);
    }
}
