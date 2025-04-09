package io.everyonecodes.java.t8_interfaces.set2.exercise1;

public class Sum implements   Operator {

    @Override
    public char getSymbol() {
        return '+';
    }

    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
