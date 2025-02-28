package io.everyonecodes.java.t5b_files.reflection.exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringToIntegersParser {

    public List<Integer> parse(String input) {
        List<Integer> result = new ArrayList<>();

        if (input.isEmpty()) {
            return result;
        }

        String[] parts = input.split(";");
        for (String part : parts) {
            try {
                int number = Integer.parseInt(part);
                result.add(number);
            } catch (NumberFormatException e) {
                System.out.print("number couldn't be parsed, will be skipped");
            }
        }

        return result;
    }
}
