package io.everyonecodes.java.t8_interfaces.set2.exercise2;

public class AdvancedThief implements Thief{
    private final int skillLevel = 2;

    @Override
    public void open(Safe safe) {
        safe.setDifficultyPoints(safe.getDifficultyPoints() - skillLevel);
    }
}
