package io.everyonecodes.java.t7_consolidation.set1.exercise4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countTrueValues(List.of(false, true, false, true)));
        System.out.println(countTrueValues(List.of(true, true, false, true)));
        System.out.println(countTrueValues(List.of(false, false)));
        System.out.println(countTrueValues(List.of(true)));
        System.out.println(countTrueValues(List.of()));
    }

    public static int countTrueValues(List<Boolean> values) {
        int count = 0;

        for (Boolean value : values) {
            if (value) {
                count++;
            }
        }

        return count;
    }
}
