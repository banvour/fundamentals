package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static List<Operator> getOperators() {
        return new ArrayList<>(List.of(
                new Sum(),
                new Subtraction(),
                new Multiplication(),
                new Division()
        ));
    }
}