package io.everyonecodes.java.t5b_files.review.exercise1;

import io.everyonecodes.java.t5b_files.reflection.exercise1.StringToIntegersParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class StringToIntegersParserTest {

    private final io.everyonecodes.java.t5b_files.reflection.exercise1.StringToIntegersParser parser = new StringToIntegersParser();

    @ParameterizedTest
    @MethodSource("parameters")
    void testParse(String input, List<Integer> expected) {
        List<Integer> result = parser.parse(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("1;2;3;4", List.of(1, 2, 3, 4)),
                Arguments.of("-1;4;0", List.of(-1, 4, 0)),
                Arguments.of("-1;ab;0", List.of(-1, 0)),
                Arguments.of("", Collections.emptyList())
        );
    }
}

