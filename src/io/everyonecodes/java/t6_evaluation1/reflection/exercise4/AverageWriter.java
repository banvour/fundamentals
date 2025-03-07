package io.everyonecodes.java.t6_evaluation1.reflection.exercise4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AverageWriter {

    public void write(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        List<String> averages = new ArrayList<>();

        for (String line : lines) {
            if (line.isEmpty()) {
                continue;
            }

            List<String> digits = List.of(line.split("\\s+"));
            double sum = 0.0;
            for (String digit : digits) {
                sum += Double.parseDouble(digit);
            }

            double average = sum / digits.size();
            averages.add(String.valueOf(average));
        }
        try {
            Files.write(output, averages);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
