package io.everyonecodes.java.t4_methods.set2.exercise5;

public class TipAdder {

    public double add(double price) {
        double pricePlusTip = price + (price * 0.05);
        return Math.ceil(pricePlusTip * 2) / 2.0;
    }
}
