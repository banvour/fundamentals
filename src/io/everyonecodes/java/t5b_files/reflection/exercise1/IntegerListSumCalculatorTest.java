package io.everyonecodes.java.t5b_files.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListSumCalculatorTest {

    private final IntegerListSumCalculator calculator = new IntegerListSumCalculator();

    @Test
    void testCalculate() {
        Optional<Integer> result = calculator.calculate(List.of(1, 2, 3, 4));
        assertTrue(result.isPresent());
        assertEquals(Optional.of(10), result);
    }

    @Test
    public void testCalculate_EmptyList() {
        Optional<Integer> result = calculator.calculate(Collections.emptyList());
        assertFalse(result.isPresent());
    }

}
