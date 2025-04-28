package io.everyonecodes.java.t10_consolidation.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static io.everyonecodes.java.t10_consolidation.exercise3.Color.BLUE;
import static io.everyonecodes.java.t10_consolidation.exercise3.Color.YELLOW;

class CardParserTest {
    private final CardParser cardParser = new CardParser();

    @ParameterizedTest
    @MethodSource("inputData")
    void parse(String input, Optional<Card> expected) {
        Optional<Card> result = cardParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of("b,7", Optional.of(new Card(7, BLUE))),
                Arguments.of("y,1", Optional.of(new Card(1, YELLOW))),
                Arguments.of("w,7", Optional.empty()),
                Arguments.of("", Optional.empty())
        );
    }
}