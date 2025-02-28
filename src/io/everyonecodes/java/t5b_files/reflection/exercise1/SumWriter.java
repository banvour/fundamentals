package io.everyonecodes.java.t5b_files.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumWriter {

    private final LinesCalculator linesCalculator = new LinesCalculator();

    public void write(String inputFilePath, String outputFilePath) {

        Path inputPath = Path.of(inputFilePath);
        try {
            List<String> lines = Files.readAllLines(inputPath);
            List<String> sums = linesCalculator.calculate(lines);
            Path outputPath = Path.of(outputFilePath);
            Files.write(outputPath, sums);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
