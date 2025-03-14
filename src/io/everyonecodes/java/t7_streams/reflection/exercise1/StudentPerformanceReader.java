package io.everyonecodes.java.t7_streams.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentPerformanceReader {

    public List<StudentPerformance> read(Path input) {
        StudentPerformanceParser parser = new StudentPerformanceParser();
        List<StudentPerformance> performances = new ArrayList<>();

        try (var lines = Files.lines(input)) {
            performances = lines
                    .skip(1)
                    .map(parser::parseLine)
                    .flatMap(Optional::stream)
                    .toList();
        } catch (IOException e) {
            System.out.println(" I/ O error from opening file");
        }

        return performances;
    }
}
