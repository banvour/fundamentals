package io.everyonecodes.java.t3_testing.set1.exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GreatestCalculator calculator = new GreatestCalculator();

        System.out.println("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNum = scanner.nextInt();

//        List<Integer> sortedNumbers = new ArrayList<>(List.of(firstNum, secondNum, thirdNum));

        System.out.println(calculator.giveGreatestNum(firstNum, secondNum, thirdNum));
    }
}
