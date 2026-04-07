package io.everyonecodes.java.t10_consolidation.exercise3;

import java.awt.*;
import java.util.Objects;

public class Card {
    private final int number;
    private final Color color;

    public boolean canPlaceOn(Card card) {
        return (card.getNumber() == number || card.getColor() == color);
    }

    public Card(int number, Color color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return number == card.number && color == card.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, color);
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", color=" + color +
                '}';
    }
}