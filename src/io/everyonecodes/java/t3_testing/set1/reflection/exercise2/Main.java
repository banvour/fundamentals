package io.everyonecodes.java.t7_consolidation.reflection.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";

        while (true) {
            System.out.println("Enter some text:");
            word = scanner.nextLine();

            if (!word.equals("stop")) {
                System.out.println("Reversed: " + reverseString(word));

                if (checkForPalindrome(word)) {
                    System.out.println("That's a palindrome!");
                }
            } else {
                break;
            }
        }
    }

    public static boolean checkForPalindrome(String word) {

        word = word.toLowerCase();
        int indexStart = 0;
        int indexEnd = word.length() - 1;

        while (indexEnd > indexStart) {
            if (word.charAt(indexStart) != word.charAt(indexEnd)) {
                return false;
            }
            ++indexStart;
            --indexEnd;
        }
        return true;
    }

    public static String reverseString(String word) {

        String reversedWord = "";
        char charExtractor;

        for (int i = 0; i < word.length(); i++) {
            charExtractor = word.charAt(i);
            reversedWord = charExtractor + reversedWord;
        }

        return reversedWord;
    }
}
