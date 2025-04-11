package io.everyonecodes.java.t8_interfaces.set1.exercise3;

import io.everyonecodes.java.t8_interfaces.set1.exercise1.Shaper;

public class RectangleShaper implements Shaper, Colored {

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
