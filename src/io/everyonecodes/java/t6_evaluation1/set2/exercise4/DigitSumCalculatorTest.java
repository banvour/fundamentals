package io.everyonecodes.java.t6_evaluation1.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DigitSumCalculatorTest {

    private final DigitSumCalculator calculator = new DigitSumCalculator();

    @ParameterizedTest
    @CsvSource({
            "248102, 17",
            "1292, 14",
            "0, 0"
    })
    void testCalculate(int input, int expectedSum) {
        int actualSum = calculator.calculate(input);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}
