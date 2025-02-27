package io.everyonecodes.java.t5b_files.set1.exercise2;

import java.util.List;
import java.util.Optional;

public class LongestNameFinder {
    public static Optional<Character> find(List<Character> characters) {
        if (characters.isEmpty()) {
            return Optional.empty();
        }

        Character longest = characters.get(0);
        for (Character character : characters) {
            if (character.getName().length() > longest.getName().length()) {
                longest = character;
            }
        }

        return Optional.of(longest);
    }
}
