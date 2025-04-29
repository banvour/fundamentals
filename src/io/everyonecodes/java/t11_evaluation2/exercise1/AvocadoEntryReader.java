package io.everyonecodes.java.t11_evaluation2.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;

public class AvocadoEntryReader {

    public List<AvocadoEntry> read(String inputPath) throws IOException {
        return Files.readAllLines(Path.of(inputPath)).stream()
                .skip(1)
                .map(line -> line.split(","))
                .map(List::of)
                .map(toAvocadoEntry())
                .collect(toList());
    }

    private Function<List<String>, AvocadoEntry> toAvocadoEntry() {
        return columns -> new AvocadoEntry(
                columns.get(11),
                Double.parseDouble(columns.get(2)),
                Double.parseDouble(columns.get(3)),
                columns.get(13),
                Integer.parseInt(columns.get(12))
        );
    }
}
