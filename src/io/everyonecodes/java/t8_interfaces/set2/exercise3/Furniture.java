package io.everyonecodes.java.t8_interfaces.set2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Furniture {
    private String name;
    private List<String> parts;

    public Furniture(String name) {
        this.name = name;
        this.parts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getParts() {
        return parts;
    }
}
