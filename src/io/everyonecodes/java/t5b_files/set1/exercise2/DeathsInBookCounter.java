package io.everyonecodes.java.t5b_files.set1.exercise2;

import java.util.List;

public class DeathsInBookCounter {
    public static int count(List<Character> characters, int bookNumber) {
        int count = 0;
        for (Character character : characters) {
            if (character.getBookOfDeath() == bookNumber) {
                count++;
            }
        }
        return count;
    }
}
