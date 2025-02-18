package io.everyonecodes.java.t3_testing.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "10, 4",
            "15, 5"
    })

    void testAdd(int expected, int input) {
        int result = calculator.add(input);

        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "6, 3",
            "1, 1"
    })

    void testMultiply(int expected, int input) {
        int result = calculator.multiply(input);

        Assertions.assertEquals(expected, result);
    }
}
