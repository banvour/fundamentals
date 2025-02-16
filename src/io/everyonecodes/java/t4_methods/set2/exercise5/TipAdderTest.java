package io.everyonecodes.java.t4_methods.set2.exercise5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipAdderTest {

    @ParameterizedTest
    @CsvSource({
            "23.14, 24.50",
            "2.45, 3.0",
            "10.01, 11.0",
            "5.49, 6.0",
            "19.99, 21.0"
    })
    void add(double input, double expected) {
        TipAdder tipAdder = new TipAdder();
        assertEquals(expected, tipAdder.add(input), 0.0001);
    }
}
