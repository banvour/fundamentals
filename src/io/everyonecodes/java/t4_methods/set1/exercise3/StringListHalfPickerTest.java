package io.everyonecodes.java.t4_methods.set1.exercise3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringListHalfPickerTest {

    @Test
    void testPicker() {
        StringListFirstHalfPicker firstHalfPicker = new StringListFirstHalfPicker();
        StringListSecondHalfPicker secondHalfPicker = new StringListSecondHalfPicker();

        List<String> strings = new ArrayList<>(List.of("A", "B", "C", "D", "E"));

        for (int i = 0; i < 10; i++) {
            String result = firstHalfPicker.pick(strings);
            System.out.print(result);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            String result = secondHalfPicker.pick(strings);
            System.out.print(result);
        }
    }
}
