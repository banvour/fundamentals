package io.everyonecodes.java.t7_streams.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StartWithMCountCharactersTest {

    @Test
    void test() {
        List<String> nums = List.of("Mary", "Joe", "Max", "Laura");

        var sum = nums.stream()
                .filter(name -> name.startsWith("M"))
                .map(String::length)
                .reduce(0, Integer::sum);

        Assertions.assertEquals(7, sum);
    }
}
