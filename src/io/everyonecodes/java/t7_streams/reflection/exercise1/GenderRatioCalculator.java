package io.everyonecodes.java.t7_streams.reflection.exercise1;

import java.util.List;

public class GenderRatioCalculator {

    public String calculate(List<StudentPerformance> students) {
        long femaleCount = students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .count();

        long maleCount = students.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("male"))
                .count();

        return femaleCount + ":" + maleCount;
    }
}
