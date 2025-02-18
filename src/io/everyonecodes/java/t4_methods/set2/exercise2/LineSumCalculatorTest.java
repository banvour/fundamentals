package io.everyonecodes.java.t4_methods.set2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineSumCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "6, '1;2;3'",
            "66, '11;22;33'",
            "7, '0;0;7'",
            "5, '5'",
            "0, ''"
    })
    void calculate_shouldReturnSum(int expected, String input) {
        LineSumCalculator calculator = new LineSumCalculator();
        assertEquals(expected, calculator.calculate(input));
    }

}
