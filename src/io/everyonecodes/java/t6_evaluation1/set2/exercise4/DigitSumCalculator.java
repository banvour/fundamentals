package io.everyonecodes.java.t6_evaluation1.set2.exercise4;

public class DigitSumCalculator {

    public int calculate(int num) {
        int sum = 0;

        String numAsString = String.valueOf(num);

        for (char digit : numAsString.toCharArray()) {
            sum += Character.getNumericValue(digit);
        }

        return sum;
    }
}
