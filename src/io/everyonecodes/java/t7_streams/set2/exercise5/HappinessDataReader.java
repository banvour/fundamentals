package io.everyonecodes.java.t7_streams.set2.exercise5;

import io.everyonecodes.java.t5b_files.set1.exercise1.HappinessDataParser;
import io.everyonecodes.java.t5b_files.set1.exercise1.HappinessRecord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public class HappinessDataReader {
    private final HappinessDataParser parser = new HappinessDataParser();

    public List<HappinessRecord> read(String filePath) throws IOException {
        return Files.readAllLines(Path.of(filePath))
                .stream()
                .skip(1)
                .map(parser::parseLine)
                .flatMap(Optional::stream)
                .toList();
    }
}
