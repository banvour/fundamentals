package io.everyonecodes.java.t8_interfaces.set2.exercise2;

public class ThiefAttemptCounter {
    public int countAttempts(Thief thief, Safe safe) {
        int attempts = 0;

        while (safe.getDifficultyPoints() > 0) {
            thief.open(safe);
            attempts++;
        }
        return attempts;
    }
}
