package io.everyonecodes.java.t11_evaluation2.exercise1;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AvocadoEntryReaderTest {

    private final String inputPath = "src/io/everyonecodes/java/t11_evaluation2/exercise1/files/avocado.csv";
    AvocadoEntryReader reader = new AvocadoEntryReader();

    @Test
    void read() throws IOException {
        List<AvocadoEntry> entries = reader.read(inputPath);

        assertFalse(entries.isEmpty());
        assertEquals(18249, entries.size());
        AvocadoEntry result = entries.get(0);
        AvocadoEntry expected = createExpected();
        assertEquals(expected, result);
    }

    private AvocadoEntry createExpected() {
        return new AvocadoEntry("conventional",
                1.33,
                64236.62,
                "Albany",
                2015);
    }
}