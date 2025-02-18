package io.everyonecodes.java.t3_testing.set1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class OutlierRemover {

    public static List<Integer> removeOutliers(List<Integer> numbers) {
        List<Integer> copiedList = new ArrayList<>(numbers);

        int greatest = numbers.get(0);
        int smallest = numbers.get(0);

        for (int number : numbers) {
            if (number > greatest) {
                greatest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        if (copiedList.size() >= 3) {
            copiedList.remove(Integer.valueOf(greatest));
            copiedList.remove(Integer.valueOf(smallest));
        }

        return copiedList;
    }
}
