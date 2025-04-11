package io.everyonecodes.java.t8_interfaces.review.cutlery;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KnifeTest {
    @Test
    void testGetName() {
        Knife knife = new Knife();
        assertEquals("knife", knife.getName());
    }

    @ParameterizedTest
    @CsvSource({
            "fish, true",
            "pasta, false",
            "'', false"
    })
    void testIsUsedFor(String dish, boolean expected) {
        Knife knife = new Knife();
        assertEquals(expected, knife.isUsedFor(dish));
    }
}