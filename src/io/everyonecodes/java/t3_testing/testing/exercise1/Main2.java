package io.everyonecodes.java.t7_consolidation.set1.exercise1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        int greatestNumber = 0;

        while (!userInput.equals("stop")) {
            System.out.println("Enter a number or type stop:");
            userInput = scanner.nextLine();
            if (!userInput.equals("stop")) {
                int userInputNumber = Integer.parseInt(userInput);
                if (userInputNumber >= greatestNumber) {
                    greatestNumber = userInputNumber;
                }
            }
        }

        System.out.print("Greatest: " + greatestNumber);
    }
}