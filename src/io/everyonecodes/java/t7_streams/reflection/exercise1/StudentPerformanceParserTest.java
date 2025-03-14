package io.everyonecodes.java.t7_streams.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StudentPerformanceParserTest {
    private final StudentPerformanceParser parser = new StudentPerformanceParser();

    @Test
    void parseLine() {
        String validLine = "header;female;bachelor's degree;72;72;74";
        Optional<StudentPerformance> oStudentPerformance = parser.parseLine(validLine);

        StudentPerformance studentPerformance = oStudentPerformance.get();

        assertEquals("female", studentPerformance.getGender());
        assertEquals("bachelor's degree", studentPerformance.getParentalEducation());
        assertEquals(72.0, studentPerformance.getMathScore());
        assertEquals(72.0, studentPerformance.getReadingScore());
        assertEquals(74.0, studentPerformance.getWritingScore());
    }

    @Test
    void parseLine_empty() {
        String invalidLine = "invalid;only;two;fields";
        Optional<StudentPerformance> oStudentPerformance = parser.parseLine(invalidLine);

        assertTrue(oStudentPerformance.isEmpty());
    }
}
