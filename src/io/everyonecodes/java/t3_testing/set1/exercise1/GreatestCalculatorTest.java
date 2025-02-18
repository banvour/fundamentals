package io.everyonecodes.java.t3_testing.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class GreatestCalculatorTest {

    GreatestCalculator greatestCalculator = new GreatestCalculator();

    @ParameterizedTest
    @CsvSource({
            "4, 2, 4, 1",
            "-1, -5, -6, -1",
            "0, 0, 0, 0"
    })

    void giveGreatestNum_test (int expected, int num1, int num2, int num3) {
        int result = greatestCalculator.giveGreatestNum(num1, num2, num3);

        Assertions.assertEquals(expected, result);
    }

}
