package io.everyonecodes.java.t7b_datastructures.enums.exercise2;

public enum Socks {
    GREENSOCKS("green socks with polka dots"),
    YELLOWSOCKS("yellow socks with circles"),
    REDSOCKS("red socks with stripes");

    private final String description;

    Socks(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
