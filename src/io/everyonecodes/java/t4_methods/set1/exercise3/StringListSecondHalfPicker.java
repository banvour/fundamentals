package io.everyonecodes.java.t4_methods.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {

    Random random = new Random();

    public String pick(List<String> words) {
        int size = words.size();
        int firstHalf = words.size() / 2;
        int randomIndex = random.nextInt(size - firstHalf) + firstHalf;
        return words.get(randomIndex);
    }
}
