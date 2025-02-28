package io.everyonecodes.java.t5b_files.reflection.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class SumWriterTest {

    @Test
    public void testWrite() throws IOException {
        String inputFilePath = "src/io/everyonecodes/java/t5b_files/reflection/files/input.csv";
        String expectedFilePath = "src/io/everyonecodes/java/t5b_files/reflection/files/expected.csv";
        String outputFilePath = "src/io/everyonecodes/java/t5b_files/reflection/files/output.csv";

        SumWriter sumWriter = new SumWriter();
        sumWriter.write(inputFilePath, outputFilePath);

        Path expectedPath = Path.of(expectedFilePath);
        Path outputPath = Path.of(outputFilePath);

        List<String> expectedLines = Files.readAllLines(expectedPath);
        List<String> outputLines = Files.readAllLines(outputPath);

        Assertions.assertEquals(expectedLines, outputLines);
    }
}
