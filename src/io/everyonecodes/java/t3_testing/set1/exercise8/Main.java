package io.everyonecodes.java.t7_consolidation.set1.exercise8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(countAboveAverage(List.of(3.0, 4.0, 6.0, 1.0, 9.0)));
//        System.out.println(countAboveAverage(List.of(3.5)));
//        System.out.println(countAboveAverage(List.of(1.5, 7.0, 9.5, 4.0)));

    }

    public static int countAboveAverage(List<Double> numbers) {
        double average = 0;

        for (double number : numbers) {
            average += number;
        }
        average = average / numbers.size();

//        System.out.println(average); -> for testing

        double greatest = average;
        int count = 0;

        for (double number : numbers) {
            if (number > greatest) {
                count++;
            }
        }
        return count;
    }
}
