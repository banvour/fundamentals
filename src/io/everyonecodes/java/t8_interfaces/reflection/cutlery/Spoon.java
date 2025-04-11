package io.everyonecodes.java.t8_interfaces.reflection.cutlery;

public class Spoon implements Cutlery {
    @Override
    public String getName() {
        return "spoon";
    }

    @Override
    public boolean isUsedFor(String dish) {
        return dish.equalsIgnoreCase("soup");
    }
}
