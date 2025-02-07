package io.everyonecodes.java.t2_dataserviceclasses.lecture.exercise8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CountAboveAvarage counter = new CountAboveAvarage();

        System.out.println(counter.countAboveAverage(List.of(3.0, 4.0, 6.0, 1.0, 9.0)));
//        System.out.println(countAboveAverage(List.of(3.5)));
//        System.out.println(countAboveAverage(List.of(1.5, 7.0, 9.5, 4.0)));

    }
}
