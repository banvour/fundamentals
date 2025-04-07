package io.everyonecodes.java.t8_interfaces.lecture;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Shape> shepes = new ArrayList<>();

        shepes.add(new Circle(1));
        shepes.add(new Rectangle(1, 1));

        for (Shape shape : shepes) {
            System.out.println(shape.getArea());
            System.out.println(shape.getCircumference());
        }
    }
}
