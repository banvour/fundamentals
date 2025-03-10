package io.everyonecodes.java.t7_streams.set1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

class NotStartWithTLengthTest {

    @Test
    void test() {
        Stream<String> stringStream = Stream.of("Hello", "there", "General", "Kenobi");
        List<Integer> expected = List.of(5, 7, 6);

        List<Integer> result = stringStream
                .filter(word -> !word.startsWith("t"))
                .map(String::length)
                .toList();

        Assertions.assertEquals(expected, result);
    }
}
