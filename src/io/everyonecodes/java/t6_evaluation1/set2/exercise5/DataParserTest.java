package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class DataParserTest {
    private final DataParser dataParser = new DataParser();

    @Test
    void parseCustomerLine_validInput() {
        String line = "Alice, 50.00, 8311 5809 3394";
        Optional<Customer> result = dataParser.parseCustomerLine(line);

        Assertions.assertTrue(result.isPresent());
        Customer customer = result.get();
        Assertions.assertEquals("Alice", customer.getName());
        Assertions.assertEquals(50.00, customer.getMoney());
        Assertions.assertEquals(List.of(8311, 5809, 3394), customer.getItemIds());
    }

    @Test
    void parseCustomerLine_invalidFormat() {
        String line = "Alice, 50.00";
        Optional<Customer> result = dataParser.parseCustomerLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseCustomerLine_invalidNumbers() {
        String line = "Alice, fifty, 8311 5809 3394";
        Optional<Customer> result = dataParser.parseCustomerLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseCustomerLine_emptyLine() {
        String line = "";
        Optional<Customer> result = dataParser.parseCustomerLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseCustomerLine_whitespaceOnly() {
        String line = "   ";
        Optional<Customer> result = dataParser.parseCustomerLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseProductLine_validInput() {
        String line = "8311; Apple; 5; 4.21";
        Optional<Product> result = dataParser.parseProductLine(line);

        Assertions.assertTrue(result.isPresent());
        Product product = result.get();
        Assertions.assertEquals(8311, product.getId());
        Assertions.assertEquals("Apple", product.getName());
        Assertions.assertEquals(5, product.getStockQuantity());
        Assertions.assertEquals(4.21, product.getPrice());
    }

    @Test
    void parseProductLine_invalidFormat() {
        String line = "8311; Apple; 5";
        Optional<Product> result = dataParser.parseProductLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseProductLine_invalidNumbers() {
        String line = "8311; Apple; five; 4.21";
        Optional<Product> result = dataParser.parseProductLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseProductLine_emptyLine() {
        String line = "";
        Optional<Product> result = dataParser.parseProductLine(line);

        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void parseProductLine_whitespaceOnly() {
        String line = "   ";
        Optional<Product> result = dataParser.parseProductLine(line);

        Assertions.assertTrue(result.isEmpty());
    }
}