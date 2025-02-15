package io.everyonecodes.java.t4_methods.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MovieTitleFormatterTest {

    @ParameterizedTest
        @CsvSource({
                "Test Test Test, test test test",
                "'', ''",
                "1 1 1, 1 1 1"
        })

    void format(String expected, String input) {
        MovieTitleFormatter formatter = new MovieTitleFormatter();
        String result = formatter.format(input);

        Assertions.assertEquals(expected, result);
    }
}
