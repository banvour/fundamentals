package io.everyonecodes.java.t5b_files.set1.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {
    HappinessDataParser dataParser = new HappinessDataParser();

    public List<HappinessRecord> read() {
        String address = "src/io/everyonecodes/java/t5b_files/exercises-files/world-happiness-2017.csv";
        Path path = Path.of(address);
        List<HappinessRecord> records = new ArrayList<>();

        try {
            List<String> linesWithHeader = Files.readAllLines(path);
            List<String> lines = linesWithHeader.subList(1, linesWithHeader.size());

            for (String line : lines) {
                Optional<HappinessRecord> happinessRecord = dataParser.parseLine(line);
                records.add(happinessRecord.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }
}
