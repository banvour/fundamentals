package io.everyonecodes.java.t7b_datastructures.sets.exercise2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BasicDictionary {
    private final Set<String> dictionary = new HashSet<>(Set.of("hi", "house", "dog", "cat", "table", "chair", "elephant"));

    public List<String> findUnknownWords(String input) {
        List<String> unknownWords = new ArrayList<>();

        String inputLowerCase = input.toLowerCase();
        List<String> inputWords = List.of(inputLowerCase.split(","));

        for (String word : inputWords) {
            if (!dictionary.contains(word)) {
                unknownWords.add(word);
            }
        }

        return unknownWords;
    }
}
