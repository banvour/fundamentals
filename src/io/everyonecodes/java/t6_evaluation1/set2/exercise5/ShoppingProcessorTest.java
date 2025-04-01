package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ShoppingProcessorTest {
    private final ShoppingProcessor shoppingProcessor = new ShoppingProcessor();

    @Test
    void processPurchases() {
        List<Customer> customers = List.of(
                new Customer("Alice", 50.00, List.of(8311, 5809, 3394)),
                new Customer("Bob", 40.00, List.of(8311, 3394)),
                new Customer("John", 10.00, List.of(5809, 3394))
        );
        List<Product> products = List.of(
                new Product(8311, "Apple", 5, 4.21),
                new Product(5809, "Butter", 2, 5.51),
                new Product(3394, "Sausage", 4, 6.94)
        );

        shoppingProcessor.processPurchases(customers, products);

        Assertions.assertEquals(3, products.get(0).getStockQuantity());
        Assertions.assertEquals(0, products.get(1).getStockQuantity());
        Assertions.assertEquals(2, products.get(2).getStockQuantity());
    }

    @Test
    void processPurchases_noPurchasesMade() {
        List<Customer> customers = List.of(
                new Customer("Charlie", 2.00, List.of(8311))
        );
        List<Product> products = List.of(
                new Product(8311, "Apple", 5, 4.21)
        );

        shoppingProcessor.processPurchases(customers, products);

        Assertions.assertEquals(5, products.get(0).getStockQuantity());
    }

    @Test
    void processPurchases_allProductsOutOfStock() {
        List<Customer> customers = List.of(
                new Customer("Dave", 50.00, List.of(8311, 5809, 3394))
        );
        List<Product> products = List.of(
                new Product(8311, "Apple", 0, 4.21),
                new Product(5809, "Butter", 0, 5.51),
                new Product(3394, "Sausage", 0, 6.94)
        );

        for (Product product : products) {
            Assertions.assertEquals(0, product.getStockQuantity());
        }

        shoppingProcessor.processPurchases(customers, products);

        Assertions.assertEquals(3, products.get(0).getStockQuantity());
        Assertions.assertEquals(3, products.get(1).getStockQuantity());
        Assertions.assertEquals(3, products.get(2).getStockQuantity());
    }

    @Test
    void processPurchases_customerWithExactMoney() {
        List<Customer> customers = List.of(
                new Customer("Eve", 6.94, List.of(3394))
        );
        List<Product> products = List.of(
                new Product(3394, "Sausage", 3, 6.94)
        );

        shoppingProcessor.processPurchases(customers, products);

        Assertions.assertEquals(2, products.get(0).getStockQuantity());
    }
}