package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

public class DataParser {
    public Optional<Customer> parseCustomerLine(String line) {
        try {
            String[] parts = line.split(",");
            if (parts.length != 3) {
                return Optional.empty();
            }
            String name = parts[0].trim();
            double money = Double.parseDouble(parts[1].trim());
            String[] itemIdStrings = parts[2].trim().split(" ");
            List<Integer> itemIds = new ArrayList<>();
            for (String idString : itemIdStrings) {
                itemIds.add(Integer.parseInt(idString));
            }
            return Optional.of(new Customer(name, money, itemIds));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }

    public Optional<Product> parseProductLine(String line) {
        try {
            String[] parts = line.split(";");
            if (parts.length != 4) {
                return Optional.empty();
            }
            int id = Integer.parseInt(parts[0].trim());
            String name = parts[1].trim();
            int stockQuantity = Integer.parseInt(parts[2].trim());
            double price = Double.parseDouble(parts[3].trim());
            return Optional.of(new Product(id, name, stockQuantity, price));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}