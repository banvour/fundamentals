package io.everyonecodes.java.t3_testing.reflection.exercise2;

import java.util.List;
import java.util.Random;

public class MaxOrMinPicker {
    public int pick(List<Integer> integers) {
        Random random = new Random();

        if (integers.isEmpty()) {
            return random.nextInt();
        }

        int max = integers.getFirst();
        int min = integers.getFirst();

        for (int num : integers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        return min + random.nextInt(max - min + 1);
    }
}
