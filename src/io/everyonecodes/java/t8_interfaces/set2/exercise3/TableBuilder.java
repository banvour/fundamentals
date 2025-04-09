package io.everyonecodes.java.t8_interfaces.set2.exercise3;

import java.util.ArrayList;
import java.util.List;

public class TableBuilder {
    private List<BuildingStep> steps = new ArrayList<>(List.of(
            new AddLeg(),
            new AddLeg(),
            new AddLeg(),
            new AddLeg(),
            new AddSurface()
    ));

    public Furniture build() {
        Furniture furniture = new Furniture("table");

        for (BuildingStep step : steps) {
            step.apply(furniture);
        }

        return furniture;
    }
}
