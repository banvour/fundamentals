package io.everyonecodes.java.t9_inheritance.set2.exercise1;

import javax.swing.JPanel;
import java.awt.*;
import java.util.List;

public class CustomDrawnPanel extends JPanel {
    private final List<Shape> shapeList;

    public CustomDrawnPanel(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for (Shape shape : shapeList) {
            shape.draw(g2d);
        }
    }
}
