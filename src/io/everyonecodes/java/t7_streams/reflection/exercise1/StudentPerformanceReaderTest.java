package io.everyonecodes.java.t7_streams.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

class StudentPerformanceReaderTest {

    private final StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test
    void read() {
        String inputFileName = "src/io/everyonecodes/java/t7_streams/reflection/reflection_files/students-performance.csv";
        Path inputFilePath = Path.of(inputFileName);

        List<StudentPerformance> result = reader.read(inputFilePath);

        StudentPerformance firstLine = result.get(0);
        Assertions.assertEquals("female", firstLine.getGender());
        Assertions.assertEquals("bachelor's degree", firstLine.getParentalEducation());
        Assertions.assertEquals(72.0, firstLine.getMathScore());
        Assertions.assertEquals(72.0, firstLine.getReadingScore());
        Assertions.assertEquals(74.0, firstLine.getWritingScore());
    }
}
