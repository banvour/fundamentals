package io.everyonecodes.java.t3_testing.lecture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyMathTest {

    MyMath myMath = new MyMath();

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "-1, -2",
            "0, 10"
    })

    void min_testTwoPositiveNum() {
        int expected = 1;
        int result = myMath.min(1,2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void min_testTwoNegativeNum() {
        int expected = -2;
        int result = myMath.min(-1,-2);

        Assertions.assertEquals(expected, result);
    }

}
