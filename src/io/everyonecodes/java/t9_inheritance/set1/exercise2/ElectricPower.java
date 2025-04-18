package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class ElectricPower extends PowerSource {
    private final double amperage;
    private final double voltage;

    public ElectricPower(double amperage, double voltage) {
        this.amperage = amperage;
        this.voltage = voltage;
    }

    public double getAmperage() {
        return amperage;
    }

    public double getVoltage() {
        return voltage;
    }
}
