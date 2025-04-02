package io.everyonecodes.java.t7b_datastructures.sets.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class BasicDictionaryTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void testFindUnknownWords(String input, List<String> expected) {
        BasicDictionary dictionary = new BasicDictionary();
        List<String> result = dictionary.findUnknownWords(input);
        Assertions.assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("hi,house,dog,cat,table,chair,elephant", List.of()),
                Arguments.of("the,elegant,cat,jumped,up,table", List.of("the", "elegant", "jumped", "up")),
                Arguments.of("alpha,beta,gamma", List.of("alpha", "beta", "gamma")),
                Arguments.of("", List.of(""))
        );
    }
}
