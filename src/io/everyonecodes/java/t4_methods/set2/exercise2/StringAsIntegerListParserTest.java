package io.everyonecodes.java.t4_methods.set2.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringAsIntegerListParserTest {

    @Test
    void parse_shouldReturnIntegerList() {
        StringAsIntegerListParser parser = new StringAsIntegerListParser();

        assertEquals(List.of(1, 2, 3), parser.parse("1;2;3"));
        assertEquals(List.of(11, 22, 33), parser.parse("11;22;33"));
        assertEquals(List.of(0, 0, 7), parser.parse("0;0;7"));
    }

    @Test
    void parse_shouldHandleEmptyString() {
        StringAsIntegerListParser parser = new StringAsIntegerListParser();
        assertEquals(List.of(), parser.parse(""));
    }

    @Test
    void parse_shouldHandleSingleNumber() {
        StringAsIntegerListParser parser = new StringAsIntegerListParser();
        assertEquals(List.of(42), parser.parse("42"));
    }
}
