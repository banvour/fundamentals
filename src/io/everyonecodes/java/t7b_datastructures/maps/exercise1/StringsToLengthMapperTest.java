package io.everyonecodes.java.t7b_datastructures.maps.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class StringsToLengthMapperTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void map(List<String> input, Map<String, Integer> expected) {
        StringsToLengthMapper mapper = new StringsToLengthMapper();
        Map<String, Integer> result = mapper.map(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of("hi", "there"), Map.of("hi", 2, "there", 5)),
                Arguments.of(List.of(), Map.of()),
                Arguments.of(List.of(""), Map.of("", 0))
        );
    }
}
