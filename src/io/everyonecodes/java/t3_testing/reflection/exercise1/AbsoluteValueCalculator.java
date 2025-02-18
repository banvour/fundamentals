package io.everyonecodes.java.t3_testing.reflection.exercise1;

public class AbsoluteValueCalculator {

    public double getAbsoluteValue(double number) {
        String numberAsString = String.valueOf(number);

        if (numberAsString.startsWith("-")) {
            numberAsString = numberAsString.replaceAll("-", "");
        }

        return Double.valueOf(numberAsString);
    }
}
