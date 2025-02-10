package io.everyonecodes.java.t7_consolidation.set1.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNum = scanner.nextInt();

        List<Integer> sortedNumbers = new ArrayList<>(List.of(firstNum, secondNum, thirdNum));

        System.out.println(giveGreatestNum(sortedNumbers));
    }

    public static int giveGreatestNum(List<Integer> numbers) {
        int greatest = 0;

        for (int number : numbers) {
            if (number >= greatest) {
                greatest = number;
            }
        }
        return greatest;
    }
}
