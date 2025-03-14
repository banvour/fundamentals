package io.everyonecodes.java.t7_streams.reflection.exercise1;

import java.util.List;
import java.util.Optional;

public class StudentPerformanceParser {

    public Optional<StudentPerformance> parseLine(String LineOfData) {

        try {
            List<String> lines = List.of(LineOfData.split(";"));

            String gender = lines.get(0);
            String parentalEducation = lines.get(1);
            double mathScore = Double.parseDouble(lines.get(2));
            double readingScore = Double.parseDouble(lines.get(3));
            double writingScore = Double.parseDouble(lines.get(4));

            return Optional.of(new StudentPerformance(gender, parentalEducation, mathScore, readingScore, writingScore));
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return Optional.empty();
        }
    }
}
