package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class DoubleListMinimumFinder {

    public Optional<Double> find(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        double min = numbers.getFirst();
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }

        }
        return Optional.of(min);
    }
}
