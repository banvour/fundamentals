package io.everyonecodes.java.t8_interfaces.review.cutlery;

public class Knife implements Cutlery {
    @Override
    public String getName() {
        return "knife";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("fish") ||
                dish.equalsIgnoreCase("pizza");
    }
}
