package io.everyonecodes.java.t7_streams.set2.exercise5;

import io.everyonecodes.java.t5b_files.set1.exercise1.HappinessRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class HappinessDataReaderTest {
    private static final String inputFilePath = "src/io/everyonecodes/java/t7_streams/files/world-happiness-2017.csv";
    private final HappinessDataReader reader = new HappinessDataReader();

    @Test
    void read() throws IOException {
        var result = reader.read(inputFilePath);
        var expected = new HappinessRecord("Lesotho", 139, 3.80800008773804);

        Assertions.assertEquals(expected, result.get(0));
    }
}
