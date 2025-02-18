package io.everyonecodes.java.t3_testing.review.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AbsoluteValueCalculatorTest {

    @ParameterizedTest
        @CsvSource({
                "3, -3",
                "3, 3",
                "0, 0"
        })

    void calculate(double expected, double input) {
        AbsoluteValueCalculator absoluteValueCalculator = new AbsoluteValueCalculator();

        double result = absoluteValueCalculator.getAbsoluteValue(input);

        Assertions.assertEquals(expected, result);
    }
}
