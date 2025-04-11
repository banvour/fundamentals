package io.everyonecodes.java.t8_interfaces.set2.exercise2;

public class BeginnerThief implements Thief {
    private final int skillLevel = 1;

    @Override
    public void open(Safe safe) {
        safe.setDifficultyPoints(safe.getDifficultyPoints() - skillLevel);
    }
}
