package io.everyonecodes.java.t8_interfaces.set1.exercise2;

import io.everyonecodes.java.t8_interfaces.set1.exercise1.CircleShaper;
import io.everyonecodes.java.t8_interfaces.set1.exercise1.Shaper;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Shaper circleShaper = new CircleShaper();
        System.out.println(circleShaper.getShape());

        Shaper squareShaper = new SquareShaper();
        System.out.println(squareShaper.getShape());

        Shaper triangleShaper = new TriangleShaper();
        System.out.println(triangleShaper.getShape());

//        List<CircleShaper> circleShapers = new ArrayList<>();
//        circleShapers.add(circleShaper);

        List<Shaper> shapers = new ArrayList<>();
        shapers.add(circleShaper);
        shapers.add(squareShaper);
        shapers.add(triangleShaper);

        List<String> shapesAsStrings = shapers.stream()
                .map(Shaper::getShape)
                .toList();

        System.out.println(shapesAsStrings);
    }
}
