package io.everyonecodes.java.t8_interfaces.lecture;

public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    public double getRadius() {
        return radius;
    }
}
