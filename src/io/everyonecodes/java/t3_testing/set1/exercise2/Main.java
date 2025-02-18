package io.everyonecodes.java.t3_testing.set1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What should I do with the numbers from 1 to " + num + "?");
        String answer = scanner.nextLine();

        if (answer.equals("add")) {
            System.out.println("Result: " + calculator.add(num));
        } else if (answer.equals("multiply")) {
            System.out.println("Result: " + calculator.multiply(num));
        } else {
            System.out.println("bro enter 'add' or 'multiply'");
        }
    }
}
