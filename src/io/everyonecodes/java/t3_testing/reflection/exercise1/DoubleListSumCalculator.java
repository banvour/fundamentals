package io.everyonecodes.java.t3_testing.reflection.exercise1;

import java.util.List;

public class DoubleListSumCalculator {

    public double calculate(List<Double> doubles) {
        if (doubles.isEmpty()) {
            return 0;
        }

        double sum = 0;

        for (double num : doubles) {
            sum += num;
        }

        return sum;
    }
}
