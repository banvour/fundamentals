package io.everyonecodes.java.t8_interfaces.review;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaiterTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void testGetCutlery(String dish, List<String> expected) {
        Waiter waiter = new Waiter();
        assertEquals(expected, waiter.getCutlery(dish));
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("soup", List.of("spoon")),
                Arguments.of("salad", List.of()),
                Arguments.of("", List.of())
        );
    }
}
