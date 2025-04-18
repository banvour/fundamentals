package io.everyonecodes.java.t9_inheritance.set2.exercise1;

import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle(Color strokeColor, Color fillColor, int strokeWidth, int margin) {
        super(strokeColor, fillColor, strokeWidth, margin);
    }
    @Override
    public void draw(Graphics2D g) {
        java.awt.Rectangle bounds = g.getClipBounds();
        int margin = getMargin();

        int x = bounds.x + margin;
        int y = bounds.y + margin;
        int width = bounds.width - 2 * margin;
        int height = bounds.height - 2 * margin;

        g.setColor(getFillColor());
        g.fillRect(x, y, width, height);

        g.setStroke(new BasicStroke(getStrokeWidth()));
        g.setColor(getStrokeColor());
        g.drawRect(x, y, width, height);
    }
}