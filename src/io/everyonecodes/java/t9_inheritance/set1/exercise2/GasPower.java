package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class GasPower extends  PowerSource {
    private final double maxPressure;

    public GasPower(double maxPressure) {
        this.maxPressure = maxPressure;
    }

    public double getMaxPressure() {
        return maxPressure;
    }
}
