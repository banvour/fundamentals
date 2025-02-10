package io.everyonecodes.java.t3_testing.testing.exercise1;

import java.util.ArrayList;
import java.util.List;


public class GreatestCalculator {

    public int giveGreatestNum(int num1, int num2, int num3) {
        List<Integer> numbers = new ArrayList<>(List.of(num1, num2, num3));
        int greatest = numbers.getFirst();

        for (int number : numbers) {
            if (number >= greatest) {
                greatest = number;
            }
        }
        return greatest;
    }
}
