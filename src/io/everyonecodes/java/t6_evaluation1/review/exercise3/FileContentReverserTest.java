package io.everyonecodes.java.t6_evaluation1.review.exercise3;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileContentReverserTest {
    private final FileContentReverser reverser = new FileContentReverser();

    @Test
    void testReverseFileContent() throws IOException {
        Path inputFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/reflection/exercise3/lines.txt");
        Path expectedFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/reflection/exercise3/lines-reversed_expected.txt");
        Path outputFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/reflection/exercise3/lines-reversed.txt");

        reverser.reverse(inputFile, outputFile);

        List<String> expectedLines = Files.readAllLines(expectedFile);
        List<String> actualLines = Files.readAllLines(outputFile);
        assertEquals(expectedLines, actualLines);
    }
}

