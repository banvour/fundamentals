package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        double max = numbers.getFirst();
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return Optional.of(max);
    }
}
