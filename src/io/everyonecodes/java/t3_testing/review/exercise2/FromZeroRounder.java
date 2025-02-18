package io.everyonecodes.java.t3_testing.review.exercise2;

public class FromZeroRounder {

    public double round(double num) {
        if (num > 0) {
            return Math.ceil(num);
        }
        return Math.floor(num);
    }
}
