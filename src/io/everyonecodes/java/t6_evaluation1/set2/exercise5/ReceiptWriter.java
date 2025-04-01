package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

public class ReceiptWriter {
    private final Path BILL_PATH = Path.of("src/io/everyonecodes/java/t10_consolidation/consolidation1/set1/exercise6/bills");

    public void writeReceiptToFile(Customer customer, List<Product> purchasedItems, double totalCost, List<Product> outOfStockItems, List<Product> insufficientFundsItems) throws IOException {
        if (!Files.exists(BILL_PATH)) {
            Files.createDirectories(BILL_PATH);
        }
        Path filePath = BILL_PATH.resolve(customer.getName() + ".txt");
        List<String> lines = new ArrayList<>();
        lines.add("----- Receipt for " + customer.getName() + " -----");
        lines.add("Money Given: " + customer.getMoney() + " Euros");
        lines.add("Purchased Items:");
        for (Product product : purchasedItems) {
            lines.add("- " + product.getName() + " (" + product.getPrice() + " Euros)");
        }

        if (!insufficientFundsItems.isEmpty()) {
            lines.add("Insufficient Funds for These Items:");
            for (Product product : insufficientFundsItems) {
                lines.add("- " + product.getName() + " (" + product.getPrice() + " Euros)");
            }
        }

        lines.add("Total Cost: " + totalCost + " Euros");
        lines.add("Change: " + (customer.getMoney() - totalCost) + " Euros");

        if (!outOfStockItems.isEmpty()) {
            lines.add("Out of Stock Items:");
            for (Product product : outOfStockItems) {
                lines.add("- " + product.getName());
            }
        }
        lines.add("----------------------------------");
        Files.write(filePath, lines);
    }
}