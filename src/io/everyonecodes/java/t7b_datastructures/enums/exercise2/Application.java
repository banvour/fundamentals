package io.everyonecodes.java.t7b_datastructures.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What day of the week is it? (1 for Monday, 7 for Sunday)");
        int dayInput = scanner.nextInt();

        System.out.println("What month is it? (1 for January, 12 for December)");
        int monthInput = scanner.nextInt();

        DayOfWeek day = DayOfWeek.of(dayInput);
        Month month = Month.of(monthInput);

        Outfit outfit = SmartDrawer.getOutfitForToday(day, month);
        SmartDrawer.sayHowItLooks(day, month, outfit);
    }
}
