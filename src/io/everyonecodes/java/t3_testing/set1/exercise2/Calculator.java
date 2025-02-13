package io.everyonecodes.java.t3_testing.set1.exercise2;

public class Calculator {

    public int add(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public int multiply(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

}
