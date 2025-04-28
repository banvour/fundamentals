package io.everyonecodes.java.t10_consolidation.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.awt.*;
import java.util.List;
import java.util.stream.Stream;

public class CardSequenceParserTest {
    private final CardSequenceParser cardSequenceParser = new CardSequenceParser();

    @ParameterizedTest
    @MethodSource("inputData")
    void parse(String input, CardSequence expected) {
        CardSequence result = cardSequenceParser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> inputData() {
        return Stream.of(
                Arguments.of("r,7;b,8;g,4", new CardSequence(List.of(new Card(7, Color.RED), new Card(8, Color.BLUE), new Card(4, Color.GREEN)))),
                Arguments.of("r,7;b,8;g,4;g,7;r,2", new CardSequence(List.of(new Card(7, Color.RED), new Card(8, Color.BLUE), new Card(4, Color.GREEN), new Card(7, Color.GREEN), new Card(2, Color.RED)))),
                Arguments.of(";", new CardSequence(List.of())),
                Arguments.of("", new CardSequence(List.of())),
                Arguments.of("r,1", new CardSequence(List.of(new Card(1, Color.RED)))),
                Arguments.of("r,5;;g,10", new CardSequence(List.of(new Card(5, Color.RED), new Card(10, Color.GREEN))))
        );
    }
}