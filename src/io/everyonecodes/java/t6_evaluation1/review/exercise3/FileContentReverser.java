package io.everyonecodes.java.t6_evaluation1.review.exercise3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class FileContentReverser {

    public void reverse(Path inputFile, Path outputFile) {
        try {
            List<String> lines = Files.readAllLines(inputFile);
            Collections.reverse(lines);
            Files.write(outputFile, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
