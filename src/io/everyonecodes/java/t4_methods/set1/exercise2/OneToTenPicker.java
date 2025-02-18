package io.everyonecodes.java.t4_methods.set1.exercise2;

import java.util.Random;

public class OneToTenPicker {

    public int pick() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
}
