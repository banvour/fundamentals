package io.everyonecodes.java.t7_streams.set2.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


class AnimalsContainSTest {

    @Test
    void test() throws IOException {
        String inputFileName = "src/io/everyonecodes/java/t7_streams/set2/exercise4/animals.txt";
        Path inputFilePath = Path.of(inputFileName);
        String expectedFileName = "src/io/everyonecodes/java/t7_streams/set2/exercise4/animals-s_expected.txt";
        Path expectedFilePath = Path.of(expectedFileName);
        String resultFileName = "src/io/everyonecodes/java/t7_streams/set2/exercise4/animals-s.txt";
        Path resultFilePath = Path.of(resultFileName);

        List<String> processedLines;
        try (Stream<String> lines = Files.lines(inputFilePath)) {
            processedLines = lines
                    .filter(animal -> animal.toLowerCase().contains("s"))
                    .map(String::toUpperCase)
                    .toList();
        }

        Files.write(resultFilePath, processedLines);

        List<String> actualLines = Files.readAllLines(resultFilePath);
        List<String> expectedLines = Files.readAllLines(expectedFilePath);

        Assertions.assertEquals(expectedLines, actualLines);
    }
}
