package io.everyonecodes.java.t3_testing.review.exercise2;

import java.util.List;

public class BeforeDashExtractor {

    public String extract(String input) {
        if (!input.contains("-")) {
            return "";
        }

        List<String> splitString = List.of(input.split("-"));

        return splitString.getFirst();
    }
}
