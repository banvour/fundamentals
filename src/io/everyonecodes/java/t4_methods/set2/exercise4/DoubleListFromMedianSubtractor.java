package io.everyonecodes.java.t4_methods.set2.exercise4;

import io.everyonecodes.java.t4_methods.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {

    public List<Double> calculate(List<Double> numbers) {
        DoubleListMedianCalculator medianCalculator = new DoubleListMedianCalculator();

        if (numbers.isEmpty()) {
            return List.of();
        }

        double median = medianCalculator.calculate(numbers);
        List<Double> result = new ArrayList<>();

        for (double num : numbers) {
            result.add(num - median);
        }

        return result;
    }
}
