package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise2;

import java.util.Optional;

public class StringOverlapFinder {

    Optional<String> find(String input, String input2) {
        for (int i = input.length(); i > 0; i--) {
            String wordPartToCheck = input.substring(i - 1);
            if (input2.startsWith(wordPartToCheck)) {
                return Optional.of(wordPartToCheck);
            }
        }
        return Optional.empty();
    }
}
