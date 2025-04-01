package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

class ReceiptWriterTest {
    private final ReceiptWriter receiptWriter = new ReceiptWriter();
    private final Path testDirectory = Path.of("src/io/everyonecodes/java/t10_consolidation/consolidation1/set1/exercise6/bills");
    private final String testFileName = "TestCustomer.txt";
    private final Path testFilePath = testDirectory.resolve(testFileName);

    @BeforeEach
    void setup() throws IOException {
        Files.createDirectories(testDirectory);
    }

    @AfterEach
    void cleanup() throws IOException {
        if (Files.exists(testFilePath)) {
            Files.delete(testFilePath);
        }
    }

    @Test
    void writeReceiptToFile() throws IOException {
        Customer customer = new Customer("TestCustomer", 20.00, List.of(1, 2));
        List<Product> purchasedItems = List.of(
                new Product(1, "Apple", 5, 4.21),
                new Product(2, "Banana", 5, 3.50)
        );
        List<Product> outOfStockItems = List.of(
                new Product(3, "Orange", 0, 5.00)
        );
        List<Product> insufficientFundsItems = List.of(
                new Product(4, "Pineapple", 2, 10.00)
        );
        double totalCost = 7.71;

        receiptWriter.writeReceiptToFile(customer, purchasedItems, totalCost, outOfStockItems, insufficientFundsItems);

        Assertions.assertTrue(Files.exists(testFilePath));
        List<String> lines = Files.readAllLines(testFilePath);
        Assertions.assertTrue(lines.contains("----- Receipt for TestCustomer -----"));
        Assertions.assertTrue(lines.contains("Money Given: 20.0 Euros"));
        Assertions.assertTrue(lines.contains("- Apple (4.21 Euros)"));
        Assertions.assertTrue(lines.contains("- Banana (3.5 Euros)"));
        Assertions.assertTrue(lines.contains("Total Cost: 7.71 Euros"));
        Assertions.assertTrue(lines.contains("Change: 12.29 Euros"));
        Assertions.assertTrue(lines.contains("- Orange"));
        Assertions.assertTrue(lines.contains("- Pineapple (10.0 Euros)"));
    }
}