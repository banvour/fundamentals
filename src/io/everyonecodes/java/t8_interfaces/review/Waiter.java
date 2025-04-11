package io.everyonecodes.java.t8_interfaces.review;

import io.everyonecodes.java.t8_interfaces.review.cutlery.Cutlery;
import io.everyonecodes.java.t8_interfaces.review.cutlery.Fork;
import io.everyonecodes.java.t8_interfaces.review.cutlery.Knife;
import io.everyonecodes.java.t8_interfaces.review.cutlery.Spoon;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private final List<Cutlery> cutleries = new ArrayList<>(List.of(
            new Spoon(),
            new Fork(),
            new Knife()
    ));


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
