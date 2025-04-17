package io.everyonecodes.java.t9_inheritance.set2.exercise1;

import java.awt.*;

public abstract class Shape {
    private final java.awt.Color strokeColor;
    private final java.awt.Color fillColor;
    private final int strokeWidth;
    private final int margin;

    public abstract void draw(Graphics2D graphics2DObject);

    public Shape(Color strokeColor, Color fillColor, int stokeWidth, int margin) {
        this.strokeColor = strokeColor;
        this.fillColor = fillColor;
        this.strokeWidth = stokeWidth;
        this.margin = margin;
    }

    public Color getStrokeColor() {
        return strokeColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public int getMargin() {
        return margin;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "strokeColor=" + strokeColor +
                ", fillColor=" + fillColor +
                ", strokeWidth=" + strokeWidth +
                ", margin=" + margin +
                '}';
    }
}