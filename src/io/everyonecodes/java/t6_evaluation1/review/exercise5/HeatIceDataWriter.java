package io.everyonecodes.java.t6_evaluation1.review.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HeatIceDataWriter {

    public void writeDifferences(List<HeatIceRecord> records, String outputFile) {
        Path path = Path.of(outputFile);

        List<String> lines = new ArrayList<>();

        for (HeatIceRecord record : records) {
            int difference = record.getNumberOfIceDays() - record.getNumberOfHeatDays();
            lines.add(record.getYear() + "," + difference);
        }

        try {
            Files.write(path, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
