package io.everyonecodes.java.t4_methods.set2.exercise1;

import java.util.List;

public class MovieTitleFormatter {

    public String format(String input) {
        if (input.isEmpty()) {
            return input;
        }

        StringCapitalizer capitalizer = new StringCapitalizer();
        List<String> words = List.of(input.split(" "));
        String capitalizedTitle = "";

        for (String word : words) {
            String capitalizedWord = capitalizer.capitalize(word);
            capitalizedTitle = capitalizedTitle + capitalizedWord + " ";
        }

        return capitalizedTitle.trim();
    }

}
