package io.everyonecodes.java.t7b_datastructures.maps.exercise3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListElementCounter {

    public Map<Integer, Integer> countNumbers(List<Integer> numbers) {
        Map<Integer, Integer> frequencyOfNumbers = new HashMap<>();

        for (int num : numbers) {
//            frequencyOfNumbers.compute(num, (k, v) -> (v == null) ? 1 : v + 1);

//            frequencyOfNumbers.put(num, frequencyOfNumbers.getOrDefault(num, 0) + 1);

            frequencyOfNumbers.merge(num, 1, Integer::sum);
        }
        return frequencyOfNumbers;
    }

    public Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> frequencyOfWords = new HashMap<>();

        for (String word : words) {
//            frequencyOfWords.compute(word, (k, v) -> (v == null) ? 1 : v + 1);

            frequencyOfWords.merge(word, 1, Integer::sum);
        }
        return frequencyOfWords;
    }
}
