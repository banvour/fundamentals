package io.everyonecodes.java.t10_consolidation.exercise1.vehicles;

public class ElectricCar extends Car {
    private final double batteryCapacity;

    public ElectricCar(double maxSpeed, int maxPersonCapacity, String modelName, double batteryCapacity) {
        super(maxSpeed, maxPersonCapacity, modelName);
        this.batteryCapacity = batteryCapacity;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String getVehicleDescription() {
        return super.getVehicleDescription() + " As for the battery, it can store up to " + batteryCapacity + "kWh.";
    }
}
