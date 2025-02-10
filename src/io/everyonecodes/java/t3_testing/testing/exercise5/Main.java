package io.everyonecodes.java.t7_consolidation.set1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(removeOutliers(List.of(3, 5, 1, 3, 9)));
        System.out.println(removeOutliers(List.of(3, 5, 1, 3, 9, 1)));
        System.out.println(removeOutliers(List.of(1, 1, 1)));
        System.out.println(removeOutliers(List.of(1, 3)));
        System.out.println(removeOutliers(List.of(6)));
        System.out.println(removeOutliers(List.of(1, 5, 3)));
    }

    public static List<Integer> removeOutliers(List<Integer> numbers) {
        List<Integer> copiedList = new ArrayList<>(numbers);

        int greatest = 0;
        int smallest = numbers.getFirst();

        for (int number : copiedList) {
            if (number >= greatest) {
                greatest = number;
            } else if (number <= smallest) {
                smallest = number;
            }
        }

        if (copiedList.size() >= 3) {
            copiedList.remove(Integer.valueOf(greatest));
            copiedList.remove(Integer.valueOf(smallest));
        }

//        System.out.println(greatest);
//        System.out.println(smallest); <-- for testing

        return copiedList;
    }
}
