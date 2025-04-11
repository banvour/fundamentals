package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForkTest {
    @Test
    void testGetName() {
        Fork fork = new Fork();
        assertEquals("fork", fork.getName());
    }

    @ParameterizedTest
    @CsvSource({
            "fish, true",
            "soup, false",
            "'', false"
    })
    void testIsUsedFor(String dish, boolean expected) {
        Fork fork = new Fork();
        assertEquals(expected, fork.isUsedFor(dish));
    }
}
