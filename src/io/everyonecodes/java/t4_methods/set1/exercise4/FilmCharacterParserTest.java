package io.everyonecodes.java.t4_methods.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FilmCharacterParserTest {

    FilmCharacterParser characterParser = new FilmCharacterParser();

    @ParameterizedTest
    @MethodSource("provideCharactersAndInputs")
    void testParse(FilmCharacter expected, String input) {
        FilmCharacter result = characterParser.parse(input);

        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> provideCharactersAndInputs() {
        return Stream.of(
                Arguments.of(new FilmCharacter("Anakin", "Skywalker"), "Anakin;Skywalker"),
                Arguments.of(new FilmCharacter("Frodo", "Baggins"), "Frodo;Baggins"),
                Arguments.of(new FilmCharacter("Spongebob", "Squarepants"), "Spongebob;Squarepants")
        );
    }
}
