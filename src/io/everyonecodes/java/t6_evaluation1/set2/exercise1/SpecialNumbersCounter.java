package io.everyonecodes.java.t6_evaluation1.set2.exercise1;

public class SpecialNumbersCounter {

    public int count(String num) {
        int count = 0;

        for (char digit : num.toCharArray()) {
            if (digit == '3' || digit == '6' || digit == '9') {
                count++;
            }
        }

        return count;
    }
}
