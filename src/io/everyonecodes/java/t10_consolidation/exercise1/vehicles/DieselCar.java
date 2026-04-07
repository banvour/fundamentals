package io.everyonecodes.java.t10_consolidation.exercise1.vehicles;

public class DieselCar extends Car {
    private final double fuelCapacity;

    public DieselCar(double maxSpeed, int maxPersonCapacity, String modelName, double fuelCapacity) {
        super(maxSpeed, maxPersonCapacity, modelName);
        this.fuelCapacity = fuelCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public String getVehicleDescription() {
        return super.getVehicleDescription() + " Furthermore, it has a fuel capacity of " + fuelCapacity + ".";
    }
}
