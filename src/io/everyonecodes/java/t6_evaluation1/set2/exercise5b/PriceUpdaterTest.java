package io.everyonecodes.java.t6_evaluation1.set2.exercise5b;

import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class PriceUpdaterTest {
    private static final Path INPUT_FILE = Paths.get("src/io/everyonecodes/java/t6_evaluation1/set2/exercise5b/billa_grocery_items.csv");
    private static final Path OUTPUT_FILE = Paths.get("src/io/everyonecodes/java/t6_evaluation1/set2/exercise5b/billa_grocery_items_updated.csv");
    private List<String> originalContent;

    @BeforeEach
    void setup() throws IOException {
        Files.createDirectories(INPUT_FILE.getParent());
        if (Files.exists(INPUT_FILE)) {
            originalContent = Files.readAllLines(INPUT_FILE);
        }
        List<String> sampleData = List.of(
                "ID;Name;Stock_Quantity;Price_in_Euros",
                "123;Milk;10;2.50",
                "456;Bread;5;1.75"
        );
        Files.write(INPUT_FILE, sampleData);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(OUTPUT_FILE);
        if (originalContent != null) {
            Files.write(INPUT_FILE, originalContent);
        } else {
            Files.deleteIfExists(INPUT_FILE);
        }
    }

    @Test
    void testPriceUpdate() throws IOException {
        PriceUpdater priceUpdater = new PriceUpdater();
        priceUpdater.updatePrices();

        Assertions.assertTrue(Files.exists(OUTPUT_FILE), "Updated file was not created");
        List<String> updatedLines = Files.readAllLines(OUTPUT_FILE);
        Assertions.assertFalse(updatedLines.isEmpty());
        Assertions.assertEquals("ID;Name;Stock_Quantity;Price_in_Euros", updatedLines.get(0));
        Assertions.assertEquals("123;Milk;10;2,68", updatedLines.get(1));
        Assertions.assertEquals("456;Bread;5;1,87", updatedLines.get(2));
    }
}
