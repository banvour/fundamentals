package io.everyonecodes.java.t6_evaluation1.reflection.exercise2;

// might come back to fix lowercase if i have enough time

public class VowelCounter {

    public int count(String word) {
        int count = 0;
        for (char letter : word.toCharArray()) {
            if (letter == 'a' ||
                    letter == 'e' ||
                    letter == 'i' ||
                    letter == 'o' ||
                    letter == 'u') {
                count++;
            }
        }
        return count;
    }
}
