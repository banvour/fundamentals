package io.everyonecodes.java.t8_interfaces.set2.exercise1;

public class Calculation {
    private char symbol;
    private double number1;
    private double number2;

    public Calculation(char symbol, double number1, double number2) {
        this.symbol = symbol;
        this.number1 = number1;
        this.number2 = number2;
    }

    public char getSymbol() {
        return symbol;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }
}
