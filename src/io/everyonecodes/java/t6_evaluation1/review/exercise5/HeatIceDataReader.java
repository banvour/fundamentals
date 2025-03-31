package io.everyonecodes.java.t6_evaluation1.review.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class HeatIceDataReader {

    public List<HeatIceRecord> read() {
        String file = "src/io/everyonecodes/java/t6_evaluation1/reflection/exercise5/DataSince1955.csv";
        Path path = Path.of(file);
        List<HeatIceRecord> records = new ArrayList<>();

        try {
            List<String> linesWithHeader = Files.readAllLines(path);
            List<String> lines = linesWithHeader.subList(1, linesWithHeader.size());

            for (String line : lines) {
                HeatIceDataParser parser = new HeatIceDataParser();
                records.add(parser.parseLine(line));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return records;
    }
}
