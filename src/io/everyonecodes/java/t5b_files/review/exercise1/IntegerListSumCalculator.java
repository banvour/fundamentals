package io.everyonecodes.java.t5b_files.review.exercise1;

import java.util.List;
import java.util.Optional;

public class IntegerListSumCalculator {
    public Optional<Integer> calculate(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return Optional.empty();
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        return Optional.of(sum);
    }
}
