package io.everyonecodes.java.t7b_datastructures.enums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class SmartDrawer {
    public static Outfit getOutfitForToday(DayOfWeek day, Month month) {
        Socks socks = switch (day) {
            case MONDAY -> Socks.REDSOCKS;
            case TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> Socks.YELLOWSOCKS;
            case SATURDAY, SUNDAY -> Socks.GREENSOCKS;
            default -> Socks.YELLOWSOCKS;
        };

        Headpiece headpiece;
        if (month == Month.NOVEMBER || month == Month.DECEMBER ||
                month == Month.JANUARY || month == Month.FEBRUARY) {
            headpiece = Headpiece.WARM;
        } else {
            headpiece = Headpiece.LIGHT;
        }

        return new Outfit(socks, headpiece);
    }

    public static void sayHowItLooks(DayOfWeek day, Month month, Outfit outfit) {
        System.out.println("On a " + day + " in " + month + " John is wearing " + outfit.getDescription() + ".");
    }
}