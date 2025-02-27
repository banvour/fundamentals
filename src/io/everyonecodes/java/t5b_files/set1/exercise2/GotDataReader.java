package io.everyonecodes.java.t5b_files.set1.exercise2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class GotDataReader {

    public List<Character> read() {
        GotDataParser dataParser = new GotDataParser();
        String address = "src/io/everyonecodes/java/t5b_files/exercises-files/got-characters.csv";
        Path path = Path.of(address);
        List<Character> characters = new ArrayList<>();

        try {
            List<String> linesWithHeader = Files.readAllLines(path);
            List<String> lines = linesWithHeader.subList(1, linesWithHeader.size());

            for (String line : lines) {
                Optional<Character> character = dataParser.parseLine(line);
                characters.add(character.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {

        }

        return characters;
    }
}
