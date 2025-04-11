package io.everyonecodes.java.t8_interfaces.review.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpoonTest {
    @Test
    void testGetName() {
        Spoon spoon = new Spoon();
        assertEquals("spoon", spoon.getName());
    }

    @ParameterizedTest
    @CsvSource({
            "soup, true",
            "pasta, false",
            "'', false"
    })
    void testIsUsedFor(String dish, boolean expected) {
        Spoon spoon = new Spoon();
        assertEquals(expected, spoon.isUsedFor(dish));
    }
}