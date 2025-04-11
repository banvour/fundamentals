package io.everyonecodes.java.t8_interfaces.reflection;

import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Cutlery;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Fork;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Knife;
import io.everyonecodes.java.t8_interfaces.reflection.cutlery.Spoon;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private final List<Cutlery> cutleries;

    public Waiter() {
        this.cutleries = new ArrayList<>(List.of(
                new Spoon(),
                new Fork(),
                new Knife()
        ));
    }

    public List<String> getCutlery(String dish) {
        List<String> appropriateCutlery = new ArrayList<>();

        for (Cutlery cutlery : cutleries) {
            if (cutlery.isUsedFor(dish)) {
                appropriateCutlery.add(cutlery.getName());
            }
        }

        return appropriateCutlery;
    }
}
