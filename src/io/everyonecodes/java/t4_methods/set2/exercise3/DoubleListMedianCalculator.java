package io.everyonecodes.java.t4_methods.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {
    public double calculate(List<Double> numbers) {
        List<Double> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);

        int middleIndex = sortedNumbers.size() / 2;
        boolean isOddList = sortedNumbers.size() % 2 == 1;

        if (isOddList) {
            return sortedNumbers.get(middleIndex);
        } else {
            return (sortedNumbers.get(middleIndex - 1) + sortedNumbers.get(middleIndex)) / 2.0;
        }
    }
}
