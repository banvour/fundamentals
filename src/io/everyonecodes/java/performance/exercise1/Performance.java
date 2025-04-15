package io.everyonecodes.java.performance.exercise1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Performance {
    public static void main(String[] args) {
        int listSize = 10000; // Adjust this to test different sizes

        // Create a list with listSize elements
        List<Integer> numbers = IntStream.rangeClosed(1, listSize).boxed().collect(Collectors.toList());

        int numberToFind = -1; // Not in the list, so worst-case

        long startTime = System.nanoTime();
        int index = findFirstIndex(numbers, numberToFind);
        long endTime = System.nanoTime();

        double durationMs = (endTime - startTime) / 1000000.0;
        System.out.println("Index found: " + index);
        System.out.println("Time taken: " + durationMs + " ms");
    }

    private static int findFirstIndex(List<Integer> numbers, int numberToFind) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == numberToFind) {
                return i;
            }
        }
        return -1;
    }

    private static boolean hasDuplicates(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    return true; // found a duplicate
                }
            }
        }
        return false; // no duplicates found
    }

}
