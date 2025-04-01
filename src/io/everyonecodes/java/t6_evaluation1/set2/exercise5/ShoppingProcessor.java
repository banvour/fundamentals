package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingProcessor {
    private final ReceiptWriter receiptWriter = new ReceiptWriter();
    private final Stocker stocker = new Stocker();

    public void processPurchases(List<Customer> customers, List<Product> products) {
        List<Product> itemsToRestock = new ArrayList<>();

        for (Customer customer : customers) {
            double totalCost = 0;
            double remainingMoney = customer.getMoney();
            List<Product> purchasedItems = new ArrayList<>();
            List<Product> outOfStockItems = new ArrayList<>();
            List<Product> insufficientFundsItems = new ArrayList<>();

            for (Integer itemId : customer.getItemIds()) {
                Optional<Product> foundProduct = Optional.empty();
                for (Product product : products) {
                    if (product.getId() == itemId) {
                        foundProduct = Optional.of(product);
                        break;
                    }
                }

                if (foundProduct.isPresent()) {
                    Product product = foundProduct.get();
                    if (product.getStockQuantity() > 0 && remainingMoney >= product.getPrice()) {
                        totalCost += product.getPrice();
                        remainingMoney -= product.getPrice();
                        purchasedItems.add(product);
                        product.setStockQuantity(product.getStockQuantity() - 1);
                    } else if (product.getStockQuantity() == 0) {
                        outOfStockItems.add(product);
                        if (!itemsToRestock.contains(product)) {
                            itemsToRestock.add(product);
                        }
                    } else if (remainingMoney < product.getPrice()) {
                        insufficientFundsItems.add(product);
                    }
                }
            }
            try {
                receiptWriter.writeReceiptToFile(customer, purchasedItems, totalCost, outOfStockItems, insufficientFundsItems);
            } catch(IOException exception) {
                System.err.println("Error writing receipt for " + customer.getName());
            }
        }
        stocker.refillStock(itemsToRestock);
    }
}