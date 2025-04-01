package io.everyonecodes.java.t6_evaluation1.set2.exercise5b;


import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class MonthlyReportTest {
    private final Path testDirectory = Path.of("src/io/everyonecodes/java/t6_evaluation1/set2/exercise5b/test_bills");
    private final Path testReportFile = Path.of("src/io/everyonecodes/java/t6_evaluation1/set2/exercise5b/monthly_report.txt");
    private final MonthlyReport monthlyReport = new MonthlyReport(testDirectory, testReportFile);

    @BeforeEach
    void setup() throws IOException {
        Files.createDirectories(testDirectory);
    }

    @AfterEach
    void cleanup() throws IOException {
        if (Files.exists(testReportFile)) {
            Files.delete(testReportFile);
        }
        if (Files.exists(testDirectory.resolve("test_receipt.txt"))) {
            Files.delete(testDirectory.resolve("test_receipt.txt"));
        }
        if (Files.exists(testDirectory.resolve("test_receipt_out_of_stock.txt"))) {
            Files.delete(testDirectory.resolve("test_receipt_out_of_stock.txt"));
        }
        if (Files.exists(testDirectory.resolve("test_receipt_purchased.txt"))) {
            Files.delete(testDirectory.resolve("test_receipt_purchased.txt"));
        }
        if(Files.exists(testDirectory)){
            Files.delete(testDirectory);
        }
    }

    @Test
    void generateReport_createsFile() throws IOException {
        monthlyReport.generateReport();
        Assertions.assertTrue(Files.exists(testReportFile));
    }

    @Test
    void generateReport_correctSummary() throws IOException {
        Path testFile = testDirectory.resolve("test_receipt.txt");
        List<String> lines = List.of(
                "----- Receipt for Charlie -----",
                "Money Given: 2.0 Euros",
                "Purchased Items:",
                "Insufficient Funds for These Items:",
                "- Apple (4.21 Euros)",
                "Total Cost: 0.0 Euros",
                "Change: 2.0 Euros",
                "----------------------------------"
        );
        Files.write(testFile, lines);

        monthlyReport.generateReport();
        List<String> reportLines = Files.readAllLines(testReportFile);
        Assertions.assertTrue(reportLines.contains("Products Customers Showed Interest In But Did/Could Not Purchase:"));
        Assertions.assertTrue(reportLines.contains("- Apple: 1 times"));
    }

    @Test
    void generateReport_handlesOutOfStockItems() throws IOException {
        Path testFile = testDirectory.resolve("test_receipt_out_of_stock.txt");
        List<String> lines = List.of(
                "----- Receipt for Dave -----",
                "Money Given: 50.0 Euros",
                "Purchased Items:",
                "Total Cost: 0.0 Euros",
                "Change: 50.0 Euros",
                "Out of Stock Items:",
                "- Apple",
                "- Butter",
                "- Sausage",
                "----------------------------------"
        );
        Files.write(testFile, lines);

        monthlyReport.generateReport();
        List<String> reportLines = Files.readAllLines(testReportFile);
        Assertions.assertTrue(reportLines.contains("Products Customers Showed Interest In But Did/Could Not Purchase:"));
        Assertions.assertTrue(reportLines.contains("- Apple: 1 times"));
        Assertions.assertTrue(reportLines.contains("- Butter: 1 times"));
        Assertions.assertTrue(reportLines.contains("- Sausage: 1 times"));
    }

    @Test
    void generateReport_correctPurchasedItems() throws IOException {
        Path testFile = testDirectory.resolve("test_receipt_purchased.txt");
        List<String> lines = List.of(
                "----- Receipt for Emily -----",
                "Money Given: 20.0 Euros",
                "Purchased Items:",
                "- Milk (2.50 Euros)",
                "- Bread (1.75 Euros)",
                "Total Cost: 4.25 Euros",
                "Change: 15.75 Euros",
                "----------------------------------"
        );
        Files.write(testFile, lines);

        monthlyReport.generateReport();
        List<String> reportLines = Files.readAllLines(testReportFile);
        Assertions.assertTrue(reportLines.contains("Products Purchased:"));
        Assertions.assertTrue(reportLines.contains("- Milk: 1 times"));
        Assertions.assertTrue(reportLines.contains("- Bread: 1 times"));
    }
}