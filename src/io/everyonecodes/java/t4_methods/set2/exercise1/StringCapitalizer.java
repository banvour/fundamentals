package io.everyonecodes.java.t4_methods.set2.exercise1;

public class StringCapitalizer {

    public String capitalize(String input) {
        if (input.isEmpty()) {
            return input;
        }

        String firstLetter = input.substring(0, 1).toUpperCase();
        return firstLetter + input.substring(1);
    }
}
