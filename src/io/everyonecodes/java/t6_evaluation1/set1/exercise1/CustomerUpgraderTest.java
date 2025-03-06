package io.everyonecodes.java.t6_evaluation1.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CustomerUpgraderTest {
    private final CustomerUpgrader upgrader = new CustomerUpgrader();

    @ParameterizedTest
    @MethodSource("parameters")
    void upgrade(Customer input, Customer expected) {
        upgrader.upgrade(input);
        Assertions.assertEquals(expected, input);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new Customer("name", "class"), new Customer("name", "business"))
        );
    }
}
