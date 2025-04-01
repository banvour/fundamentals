package io.everyonecodes.java.t6_evaluation1.set2.exercise5b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MonthlyReport {
    private final Path billsDirectory;
    private final Path reportFile;

    public MonthlyReport(Path billsDirectory, Path reportFile) {
        this.billsDirectory = billsDirectory;
        this.reportFile = reportFile;
    }

    public MonthlyReport() {
        this.billsDirectory = Path.of("src/io/everyonecodes/java/t10_consolidation/consolidation1/set1/exercise6/bills");
        this.reportFile = Path.of("src/io/everyonecodes/java/t10_consolidation/consolidation1/set1/exercise8/monthly_report.txt");
    }

    public void generateReport() throws IOException {
        List<String> allReceipts = readAllReceipts();
        List<String> purchasedProducts = new ArrayList<>();
        List<String> interestedProducts = new ArrayList<>();
        boolean outOfStockSection = false;
        boolean insufficientFundsSection = false;

        for (String line : allReceipts) {
            if (line.startsWith("Out of Stock Items:")) {
                outOfStockSection = true;
                insufficientFundsSection = false;
                continue;
            }
            if (line.startsWith("Insufficient Funds for These Items:")) {
                insufficientFundsSection = true;
                outOfStockSection = false;
                continue;
            }
            if (line.startsWith("- ")) {
                if (line.contains("(") && line.contains("Euros)")) {
                    String productName = extractProductName(line);
                    if (insufficientFundsSection) {
                        interestedProducts.add(productName);
                    } else {
                        purchasedProducts.add(productName);
                    }
                } else if (outOfStockSection) {
                    String productName = line.substring(2).trim();
                    interestedProducts.add(productName);
                }
            } else {
                outOfStockSection = false;
                insufficientFundsSection = false;
            }
        }

        List<String> summary = generateSummary(purchasedProducts, interestedProducts);
        Files.createDirectories(reportFile.getParent());
        Files.write(reportFile, summary);
        System.out.println("Monthly report generated successfully!");
    }

    private List<String> readAllReceipts() throws IOException {
        List<String> allLines = new ArrayList<>();
        if (Files.exists(billsDirectory)) {
            for (Path file : Files.newDirectoryStream(billsDirectory, "*.txt")) {
                allLines.addAll(Files.readAllLines(file));
            }
        }
        return allLines;
    }

    private String extractProductName(String line) {
        int startIndex = 2;
        int endIndex = line.lastIndexOf(" (");
        return line.substring(startIndex, endIndex).trim();
    }

    private List<String> generateSummary(List<String> purchased, List<String> interested) {
        List<String> summary = new ArrayList<>();
        summary.add("----- Monthly Report -----");
        summary.add("Products Purchased:");
        countOccurrences(purchased, summary);
        summary.add("\nProducts Customers Showed Interest In But Did/Could Not Purchase:");
        countOccurrences(interested, summary);
        summary.add("-----------------------------");
        return summary;
    }

    private void countOccurrences(List<String> products, List<String> output) {
        List<String> counted = new ArrayList<>();
        for (String product : products) {
            if (!counted.contains(product)) {
                int count = 0;
                for (String p : products) {
                    if (p.equals(product)) {
                        count++;
                    }
                }
                counted.add(product);
                output.add("- " + product + ": " + count + " times");
            }
        }
    }
}