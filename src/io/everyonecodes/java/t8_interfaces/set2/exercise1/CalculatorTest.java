package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdditionCalculation() {
        Calculation calc = new Calculation('+', 1.0, 2.0);
        Optional<Double> result = calculator.calculate(calc);
        assertTrue(result.isPresent());
        assertEquals(3.0, result.get(), 0.0001);
    }

    @Test
    void testSubtractionCalculation() {
        Calculation calc = new Calculation('-', 5.0, 3.0);
        Optional<Double> result = calculator.calculate(calc);
        assertTrue(result.isPresent());
        assertEquals(2.0, result.get(), 0.0001);
    }

    @Test
    void testMultiplicationCalculation() {
        Calculation calc = new Calculation('*', 3.0, 4.0);
        Optional<Double> result = calculator.calculate(calc);
        assertTrue(result.isPresent());
        assertEquals(12.0, result.get(), 0.0001);
    }

    @Test
    void testDivisionCalculation() {
        Calculation calc = new Calculation('/', 10.0, 2.0);
        Optional<Double> result = calculator.calculate(calc);
        assertTrue(result.isPresent());
        assertEquals(5.0, result.get(), 0.0001);
    }
}