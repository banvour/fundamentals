package io.everyonecodes.java.t3_testing.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PoundToEuroConverterTest {

    @ParameterizedTest
        @CsvSource({
                "1.0, 0.85",
                "100.0, 85",
                "0, 0"
        })

    void convert(double expected, double input) {
        PoundToEuroConverter poundToEuroConverter = new PoundToEuroConverter();

        double result = poundToEuroConverter.convert(input);

        Assertions.assertEquals(expected, result);
    }
}
