package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculate(List<Integer> wholeNumbers) {
        if (wholeNumbers.isEmpty()) {
            return Optional.empty();
        }

        double sum = 0;
        for (Integer num : wholeNumbers) {
            sum += num;
        }
        sum /= wholeNumbers.size();

        return Optional.of(sum);
    }
}
