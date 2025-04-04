package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.util.List;

public class Stocker {
    private static final int REFILL_AMOUNT = 3;

    public void refillStock(List<Product> outOfStockProducts) {
        for (Product product : outOfStockProducts) {
            if (product.getStockQuantity() == 0) {
                product.setStockQuantity(REFILL_AMOUNT);
                System.out.println("Stocker: Restocked " + product.getName() + " to " + REFILL_AMOUNT);
            }
        }
    }
}