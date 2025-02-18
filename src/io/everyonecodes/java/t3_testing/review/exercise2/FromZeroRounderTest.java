package io.everyonecodes.java.t3_testing.review.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FromZeroRounderTest {

    private final FromZeroRounder rounder = new FromZeroRounder();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "1.1, 2",
            "-1.1, -2"
    })
    void round(double input, double expected) {
        double result = rounder.round(input);
        Assertions.assertEquals(expected, result);
    }
}
