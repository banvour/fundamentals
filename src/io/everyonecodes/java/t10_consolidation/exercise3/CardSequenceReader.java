package io.everyonecodes.java.t10_consolidation.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CardSequenceReader {
    private final CardSequenceParser cardSequenceParser = new CardSequenceParser();


    public List<CardSequence> read() {
        List<String> listOfLinesFromFile = new ArrayList<>();
        try {
            listOfLinesFromFile = Files.readAllLines(Path.of("src/io/everyonecodes/java/t10_consolidation/exercise3/files/sequences.txt"));
        } catch (IOException e) {
            return new ArrayList<>();
        }

        listOfLinesFromFile.remove(1);

        return listOfLinesFromFile.stream()
                .map(cardSequenceParser::parse)
                .collect(Collectors.toList());
    }
}