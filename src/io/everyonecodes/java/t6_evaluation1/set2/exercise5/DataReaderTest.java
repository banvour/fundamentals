package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class DataReaderTest {
    public final String groceries = "src/io/everyonecodes/java/t6_evaluation1/set2/exercise5/billa_grocery_items.csv";
    public final String customers = "src/io/everyonecodes/java/t6_evaluation1/set2/exercise5/customer_purchases.csv";
    private final DataReader dataReader = new DataReader();

    @Test
    void readCustomerFileReturnsCorrectData() throws IOException {
        List<Customer> result = dataReader.readCustomerFile(customers);

        int expectedSize = 10;
        Assertions.assertEquals(expectedSize, result.size());

        Customer expectedFirst = new Customer("Alice", 21.22, List.of(3394, 4200, 1114, 5809));
        Customer resultFirst = result.get(0);
        Assertions.assertEquals(expectedFirst, resultFirst);
    }

    @Test
    void readProductFileReturnsCorrectData() throws IOException {
        List<Product> result = dataReader.readProductFile(groceries);

        int expectedSize = 51;
        Assertions.assertEquals(expectedSize, result.size());

        Product expectedFirst = new Product(8311, "Apple", 7, 4.21);
        Product resultFirst = result.get(0);
        Assertions.assertEquals(expectedFirst, resultFirst);
    }
}