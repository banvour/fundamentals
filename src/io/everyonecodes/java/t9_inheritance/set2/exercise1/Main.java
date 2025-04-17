package io.everyonecodes.java.t9_inheritance.set2.exercise1;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // You can just ignore this stuff with the EventQueue. For now, it's enough to know that this is needed for Java Swing to work properly
        EventQueue.invokeLater(() -> {
            // Create the application's main Window
            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setTitle("Drawing");
            frame.setSize(640, 480);
            frame.setMinimumSize(new Dimension(640, 480));
            frame.setLocationRelativeTo(null); // Places window at center of screen
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // These classes should be created by you. Uncomment these lines as you create them:
                frame.add(new CustomDrawnPanel(
                        List.of(
                                new Triangle(Color.BLACK, Color.GREEN, 4, 50),
                                new Rectangle(Color.BLACK, Color.RED, 4, 100),
                                new Oval(Color.BLACK, Color.BLUE, 10, 200)
                        )
                ));
        });
    }
}

