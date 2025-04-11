package io.everyonecodes.java.t8_interfaces.review.cutlery;

public class Fork implements Cutlery {
    @Override
    public String getName() {
        return "fork";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("fish") ||
                dish.equalsIgnoreCase("pizza") ||
                dish.equalsIgnoreCase("pasta");
    }
}
