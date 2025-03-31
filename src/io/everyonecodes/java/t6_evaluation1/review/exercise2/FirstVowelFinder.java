package io.everyonecodes.java.t6_evaluation1.review.exercise2;

import java.util.Optional;

// might come back to fix lowercase if i have enough time

public class FirstVowelFinder {

    public Optional<Character> find(String word) {
        for (char letter : word.toCharArray()) {
            if (letter == 'a' ||
                    letter == 'e' ||
                    letter == 'i' ||
                    letter == 'o' ||
                    letter == 'u') {
                return Optional.of(letter);
            }
        }
        return Optional.empty();
    }

}
