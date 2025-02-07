package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise4;

import java.util.List;

public class AverageCalculator {

    public double calculateAverage(List<Integer> numbers) {
        double average = 0;

        for (int number : numbers) {
            average += number;
        }
        average /= numbers.size();

        return average;
    }
}
