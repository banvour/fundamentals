package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class Drill {
    private final String drillTipMaterial;
    private final double size;
    private final PowerSource powerSource;

    public Drill(String drillTipMaterial, double size, PowerSource powerSource) {
        this.drillTipMaterial = drillTipMaterial;
        this.size = size;
        this.powerSource = powerSource;
    }

    public String getDrillTipMaterial() {
        return drillTipMaterial;
    }

    public double getSize() {
        return size;
    }

    public PowerSource getPowerSource() {
        return powerSource;
    }
}
