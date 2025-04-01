package io.everyonecodes.java.t6_evaluation1.set2.exercise5b;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class PriceUpdater {
    private static final Path INPUT_FILE = Paths.get("src/io/everyonecodes/java/t6_evaluation1/set2/exercise5b/billa_grocery_items.csv");
    private static final Path OUTPUT_FILE = Paths.get("src/io/everyonecodes/java/t6_evaluation1/set2/exercise5b/billa_grocery_items_updated.csv");

    public void updatePrices() throws IOException {
        List<String> lines = Files.readAllLines(INPUT_FILE);
        List<String> updatedLines = new ArrayList<>();

        if (!lines.isEmpty()) {
            updatedLines.add(lines.get(0));
        }

        for (int i = 1; i < lines.size(); i++) {
            String[] columns = lines.get(i).split(";");
            if (columns.length >= 4) {
                double oldPrice = Double.parseDouble(columns[3]);
                double newPrice = Math.round(oldPrice * 1.07 * 100.0) / 100.0;
                columns[3] = String.format("%.2f", newPrice);
            }
            updatedLines.add(String.join(";", columns));
        }
        Files.write(OUTPUT_FILE, updatedLines);
    }
}
