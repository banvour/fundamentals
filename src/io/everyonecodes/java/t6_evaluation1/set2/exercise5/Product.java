package io.everyonecodes.java.t6_evaluation1.set2.exercise5;

import java.util.Objects;

public class Product {
    private final int id;
    private final String name;
    private int stockQuantity;
    private double price;

    public Product(int id, String name, int stockQuantity, double price) {
        this.id = id;
        this.name = name;
        this.stockQuantity = stockQuantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int newStockQuantity) {
        stockQuantity = newStockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product that = (Product) o;
        return id == that.id && stockQuantity == that.stockQuantity && Double.compare(that.price, price) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, stockQuantity, price);
    }

    @Override
    public String toString() {
        return "ProductRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", price=" + price +
                '}';
    }
}