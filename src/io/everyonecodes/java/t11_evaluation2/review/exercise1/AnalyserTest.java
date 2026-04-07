package io.everyonecodes.java.t11_evaluation2.review.exercise1;

import io.everyonecodes.java.t11_evaluation2.exercise1.Analyser;
import io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry;
import io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntryReader;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnalyserTest {

    private static final String inputPath = "src/io/everyonecodes/java/t11_evaluation2/exercise1/files/avocado.csv";
    private static final AvocadoEntryReader reader = new AvocadoEntryReader();
    private final Analyser analyser = new Analyser();

    @ParameterizedTest
    @MethodSource("parameters")
    void analyse(List<String> expected, List<AvocadoEntry> entries) {
        List<String> result = analyser.analyse(entries);

        assertEquals(expected, result);
    }

    static Stream<Arguments> parameters() throws IOException {
        return Stream.of(
                Arguments.of(
                        List.of("Lowest average price in Denver is: Result not found",
                                "In 2016, the total number of organic avocados sold in the Chicago region was: Result not found"),
                        List.of()),
                Arguments.of(
                        List.of("Lowest average price in Denver is: 0.6 in 2016",
                                "In 2016, the total number of organic avocados sold in the Chicago region was: 1630772"),
                        reader.read(inputPath)
                )
        );
    }
}
