package io.everyonecodes.java.t8_interfaces.set2.exercise2;

import java.util.Objects;

public class Safe {
    private int difficultyPoints;
    private final int securityLevel;

    public Safe(int difficultyPoints, int securityLevel) {
        this.difficultyPoints = difficultyPoints;
        this.securityLevel = securityLevel;
    }

    public int getDifficultyPoints() {
        return difficultyPoints;
    }

    public void setDifficultyPoints(int difficultyPoints) {
        this.difficultyPoints = difficultyPoints;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return difficultyPoints == safe.difficultyPoints && securityLevel == safe.securityLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(difficultyPoints, securityLevel);
    }
}
