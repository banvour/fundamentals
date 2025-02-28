package io.everyonecodes.java.t5b_files.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LinesCalculatorTest {

    private final LinesCalculator calculator = new LinesCalculator();

    @Test
    void testCalculate() {
        List<String> input = List.of("1;2;3;4", "-1;4;0", "-1;ab;0", "");
        List<String> expected = List.of("10", "3", "-1", "");
        List<String> result = calculator.calculate(input);
        assertEquals(expected, result);
    }
}