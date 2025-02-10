package io.everyonecodes.java.t7_consolidation.set1.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What should I do with the numbers from 1 to " + num + "?");
        String answer = scanner.nextLine();

        if (answer.equals("add")) {
            System.out.println("Result: " + add(num));
        } else if (answer.equals("multiply")) {
            System.out.println("Result: " + multiply(num));
        } else {
            System.out.println("bro enter 'add' or 'multiply'");
        }
    }

    public static int add(int num) {
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static int multiply(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
