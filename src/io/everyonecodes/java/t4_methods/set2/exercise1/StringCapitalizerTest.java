package io.everyonecodes.java.t4_methods.set2.exercise1;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringCapitalizerTest {

    @ParameterizedTest
    @CsvSource({
            "Test, test",
            "'', ''",
            "1, 1"
    })
    void capitalize(String expected, String input) {
        StringCapitalizer stringCapitalizer = new StringCapitalizer();

        String result = stringCapitalizer.capitalize()

    }
}
