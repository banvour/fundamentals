package io.everyonecodes.java.t8_interfaces.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleShaperTest {

    @Test
    public void getShape() {
        CircleShaper circleShaper = new CircleShaper();
        assertEquals("Circle", circleShaper.getShape());

        Shaper shaper = circleShaper;
        assertEquals("Circle", shaper.getShape());

        Shaper anotherShaper = new CircleShaper();
        assertEquals("Circle", anotherShaper.getShape());
    }
}
