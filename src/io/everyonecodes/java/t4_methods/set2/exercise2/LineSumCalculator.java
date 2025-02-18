package io.everyonecodes.java.t4_methods.set2.exercise2;

import java.util.List;

public class LineSumCalculator {

    StringAsIntegerListParser parser = new StringAsIntegerListParser();

    public int calculate(String input) {
        List<Integer> numbers = parser.parse(input);
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

}
