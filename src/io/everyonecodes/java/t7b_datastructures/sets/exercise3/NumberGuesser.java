package io.everyonecodes.java.t7b_datastructures.sets.exercise3;

import java.util.*;

public class NumberGuesser {

    public void startGame() {
        Random random = new Random();

        int num = random.nextInt(15);
        int userGuess = 15;
        Set<Integer> guessedNumbers = new HashSet<>();

        while (!(userGuess == num)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guess the number:");
            try {
                userGuess = scanner.nextInt();

                if (guessedNumbers.contains(userGuess)) {
                    System.out.println("You've already tried guessing the number " + userGuess + ".");
                } else if (userGuess == num) {
                    System.out.println(userGuess + " is the correct number, congratulations!");
                } else if (!(userGuess == num)) {
                    if (userGuess < num) {
                        System.out.println("The actual number is bigger.");
                    } else if (userGuess > num) {
                        System.out.println("The actual number is smaller.");
                    }
                }
                guessedNumbers.add(userGuess);

            } catch (InputMismatchException e) {
                System.out.println("i said to guess a NUMBER!");
            }
        }
    }
}
