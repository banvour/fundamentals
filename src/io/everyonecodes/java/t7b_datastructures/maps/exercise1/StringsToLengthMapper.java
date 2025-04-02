package io.everyonecodes.java.t7b_datastructures.maps.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringsToLengthMapper {

    public Map<String, Integer> map(List<String> words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, word.length());
        }

        return map;
    }
}
