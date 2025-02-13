package io.everyonecodes.java.t3_testing.set1.exercise4;

import java.util.List;

public class ValueCounter {
    public int countTrueValues(List<Boolean> values) {
        int count = 0;

        for (Boolean value : values) {
            if (value) {
                count++;
            }
        }

        return count;
    }
}
