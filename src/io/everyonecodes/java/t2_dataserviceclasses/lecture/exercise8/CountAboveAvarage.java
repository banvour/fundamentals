package io.everyonecodes.java.t2_dataserviceclasses.lecture.exercise8;

import java.util.List;

public class CountAboveAvarage {

    public int countAboveAverage(List<Double> numbers) {
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
