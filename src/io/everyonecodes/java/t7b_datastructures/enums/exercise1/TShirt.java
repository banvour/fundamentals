package io.everyonecodes.java.t7b_datastructures.enums.exercise1;

import java.util.Objects;

public class TShirt {
    private final String color;
    private final TShirtSize size;
    private final double price;

    public TShirt(String color, TShirtSize size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public TShirtSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
