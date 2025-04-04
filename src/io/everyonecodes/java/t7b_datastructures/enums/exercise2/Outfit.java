package io.everyonecodes.java.t7b_datastructures.enums.exercise2;

public class Outfit {
    private final Socks socks;
    private final Headpiece headpiece;

    public Outfit(Socks socks, Headpiece headpiece) {
        this.socks = socks;
        this.headpiece = headpiece;
    }

    public Socks getSocks() {
        return socks;
    }

    public Headpiece getHeadpiece() {
        return headpiece;
    }

    public String getDescription() {
        return "a " + headpiece.getDescription() + " a " + socks.getDescription();
    }
}
