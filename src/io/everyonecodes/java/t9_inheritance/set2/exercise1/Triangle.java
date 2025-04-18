package io.everyonecodes.java.t9_inheritance.set2.exercise1;

import java.awt.*;

public class Triangle extends Shape {
    public Triangle(Color strokeColor, Color fillColor, int strokeWidth, int margin) {
        super(strokeColor, fillColor, strokeWidth, margin);
    }

    @Override
    public void draw(Graphics2D g) {
        java.awt.Rectangle bounds = g.getClipBounds();
        int margin = getMargin();


        int x1 = bounds.x + margin;
        int y1 = bounds.y + margin;
        int x2 = bounds.x + bounds.width - margin;
        int y2 = bounds.y + margin;
        int x3 = bounds.x + bounds.width / 2;
        int y3 = bounds.y + bounds.height - margin;

        int[] xPoints = {x1, x2, x3};
        int[] yPoints = {y1, y2, y3};

        g.setColor(getFillColor());
        g.fillPolygon(xPoints, yPoints, 3);

        g.setStroke(new BasicStroke(getStrokeWidth()));
        g.setColor(getStrokeColor());
        g.drawPolygon(xPoints, yPoints, 3);
    }
}