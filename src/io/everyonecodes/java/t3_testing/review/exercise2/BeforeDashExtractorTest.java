package io.everyonecodes.java.t3_testing.review.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BeforeDashExtractorTest {

    private final BeforeDashExtractor extractor = new BeforeDashExtractor();

    @ParameterizedTest
    @CsvSource({
            "my-string, my",
            "Some example, ''",
            "'', ''"
    })
    void extract(String input, String expected) {
        String result = extractor.extract(input);
        Assertions.assertEquals(expected, result);
    }
}
