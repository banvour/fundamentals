package io.everyonecodes.java.t8_interfaces.set1.exercise3;

import io.everyonecodes.java.t8_interfaces.set1.exercise1.Shaper;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        RectangleShaper rectangleShaper = new RectangleShaper();
        System.out.println(rectangleShaper.getShape());
        System.out.println(rectangleShaper.getColor());

        Colored colored = (Colored) rectangleShaper;
        System.out.println(colored.getColor());

        Shaper shaper = (Shaper) rectangleShaper;
        System.out.println(shaper.getShape());

        List<RectangleShaper> rectangleShapers = new ArrayList<>();
        rectangleShapers.add(rectangleShaper);

        List<Colored> coloreds = new ArrayList<>();
//        coloreds.add(shaper);
        coloreds.add(colored);

        List<Shaper> shapers = new ArrayList<>();
        shapers.add(rectangleShaper);
//        shapers.add(colored);
    }
}
