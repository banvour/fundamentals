package io.everyonecodes.java.t7_streams.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;

class GenderRatioCalculatorTest {

    private final GenderRatioCalculator calculator = new GenderRatioCalculator();
    private final StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test
    void calculate() {
        String inputFileName = "src/io/everyonecodes/java/t7_streams/reflection/reflection_files/students-performance.csv";
        Path inputFilePath = Path.of(inputFileName);

        String result = calculator.calculate(reader.read(inputFilePath));

        Assertions.assertEquals("518:482", result);
    }
}
