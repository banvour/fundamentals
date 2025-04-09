package io.everyonecodes.java.t8_interfaces.set2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThiefAttemptCounterTest {
    @Test
    void countAttemptsForBeginnerThief() {
        Safe safe = new Safe(5, 1);
        BeginnerThief thief = new BeginnerThief();
        ThiefAttemptCounter counter = new ThiefAttemptCounter();
        int attempts = counter.countAttempts(thief, safe);
        assertEquals(5, attempts);
    }

    @Test
    void countAttemptsForAdvancedThief() {
        Safe safe = new Safe(5, 1);
        AdvancedThief thief = new AdvancedThief();
        ThiefAttemptCounter counter = new ThiefAttemptCounter();
        int attempts = counter.countAttempts(thief, safe);
        assertEquals(3, attempts);
    }
    @Test
    void countAttemptsNegativeDifficulty() {
        Safe safe = new Safe(-2, 1);
        BeginnerThief thief = new BeginnerThief();
        ThiefAttemptCounter counter = new ThiefAttemptCounter();
        int attempts = counter.countAttempts(thief, safe);
        assertEquals(0, attempts);
    }
}
