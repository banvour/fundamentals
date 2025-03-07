package io.everyonecodes.java.t6_evaluation1.reflection.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class AverageWriterTest {
    private final AverageWriter writer = new AverageWriter();

    @Test
    void testWriteAverages() throws IOException {
        Path inputFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/reflection/exercise4/numbers.txt");
        Path expectedFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/reflection/exercise4/averages_expected.txt");
        Path outputFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/reflection/exercise4/averages.txt");

        writer.write(inputFile, outputFile);

        List<String> expectedLines = Files.readAllLines(expectedFile);
        List<String> actualLines = Files.readAllLines(outputFile);

        Assertions.assertEquals(expectedLines, actualLines);
    }
}
