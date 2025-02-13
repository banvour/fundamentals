package io.everyonecodes.java.t4_methods.set1.exercise3;

import java.util.List;
import java.util.Random;

public class StringListFirstHalfPicker {

    Random random = new Random();

    public String pick(List<String> words) {
        int size = (words.size() + 1) / 2;
        int randomIndex = random.nextInt(size);
        return words.get(randomIndex);
    }
}
