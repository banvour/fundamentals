package io.everyonecodes.java.t11_evaluation2.review.exercise1;

import io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry;
import io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntryReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AvocadoEntryReaderTest {

    private final String inputPath = "src/io/everyonecodes/java/t11_evaluation2/exercise1/files/avocado.csv";
    io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntryReader reader = new AvocadoEntryReader();

    @Test
    void read() throws IOException {
        List<io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry> entries = reader.read(inputPath);

        assertFalse(entries.isEmpty());
        assertEquals(18249, entries.size());
        io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry result = entries.get(0);
        io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry expected = createExpected();
        assertEquals(expected, result);
    }

    private io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry createExpected() {
        return new AvocadoEntry("conventional",
                1.33,
                64236.62,
                "Albany",
                2015);
    }
}