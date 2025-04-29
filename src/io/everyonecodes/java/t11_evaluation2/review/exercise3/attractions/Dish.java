package io.everyonecodes.java.t11_evaluation2.review.exercise3.attractions;

public class Dish {
    private final String name;
    private final double price;

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ":" + price + "\n";
    }
}
