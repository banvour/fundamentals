package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StockerTest {
    private final Stocker stocker = new Stocker();

    @Test
    void refillStock_productsOutOfStock() {
        List<Product> products = List.of(
                new Product(1, "Apple", 0, 2.50),
                new Product(2, "Banana", 0, 1.50),
                new Product(3, "Orange", 0, 3.00)
        );

        stocker.refillStock(products);

        Assertions.assertEquals(3, products.get(0).getStockQuantity());
        Assertions.assertEquals(3, products.get(1).getStockQuantity());
        Assertions.assertEquals(3, products.get(2).getStockQuantity());
    }

    @Test
    void refillStock_someProductsInStock() {
        List<Product> products = List.of(
                new Product(1, "Apple", 0, 2.50),
                new Product(2, "Banana", 2, 1.50),
                new Product(3, "Orange", 0, 3.00)
        );

        stocker.refillStock(products);

        Assertions.assertEquals(3, products.get(0).getStockQuantity());
        Assertions.assertEquals(2, products.get(1).getStockQuantity()); // Should remain unchanged
        Assertions.assertEquals(3, products.get(2).getStockQuantity());
    }

    @Test
    void refillStock_noProductsOutOfStock() {
        List<Product> products = List.of(
                new Product(1, "Apple", 5, 2.50),
                new Product(2, "Banana", 2, 1.50),
                new Product(3, "Orange", 4, 3.00)
        );

        stocker.refillStock(products);

        Assertions.assertEquals(5, products.get(0).getStockQuantity());
        Assertions.assertEquals(2, products.get(1).getStockQuantity());
        Assertions.assertEquals(4, products.get(2).getStockQuantity());
    }
}
