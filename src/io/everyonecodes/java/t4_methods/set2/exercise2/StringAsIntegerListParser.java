package io.everyonecodes.java.t4_methods.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {

    public List<Integer> parse(String input) {
        List<String> strings = List.of(input.split(";"));
        List<Integer> numbers = new ArrayList<>();

        if (input.isEmpty()) {
            return List.of();
        }

        for (String string : strings) {
            int number = Integer.valueOf(string);
            numbers.add(number);
        }

        return numbers;
    }
}
