package io.everyonecodes.java.t6_evaluation1.set1.exercise2;

import io.everyonecodes.java.t6_evaluation1.set1.exercise1.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ScreenNameFormatterTest {

    private final ScreenNameFormatter formatter = new ScreenNameFormatter();

    @ParameterizedTest
    @MethodSource("parameters")
    void create(Customer input, String expected) {
        String result = formatter.create(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new Customer("name", "business"), "NAME"),
                Arguments.of(new Customer("name", "economy"), "name"),
                Arguments.of(new Customer("Name", "Economy"), "name"),
                Arguments.of(new Customer("Name", "Business"), "NAME"),
                Arguments.of(new Customer("", ""), "wrong value")
        );
    }
}
