package io.everyonecodes.java.t3_testing.review.exercise2;

import java.util.List;

public class Debugger {
    public static void main(String[] args) {
        MaxOrMinPicker picker = new MaxOrMinPicker();

        List<Integer> numbers = List.of(5, 1, 9, 3, 7);
        System.out.println(picker.pick(numbers));

        List<Integer> emptyList = List.of();
        System.out.println(picker.pick(emptyList));
    }
}
