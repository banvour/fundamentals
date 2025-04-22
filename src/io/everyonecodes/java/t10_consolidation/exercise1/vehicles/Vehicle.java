package io.everyonecodes.java.t10_consolidation.exercise1.vehicles;

public abstract class Vehicle {
    private final double maxSpeed;
    private final int maxPersonCapacity;

    public Vehicle(double maxSpeed, int maxPersonCapacity) {
        this.maxSpeed = maxSpeed;
        this.maxPersonCapacity = maxPersonCapacity;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxPersonCapacity() {
        return maxPersonCapacity;
    }

    public String getVehicleDescription() {
        return "Maximum Speed: " + maxSpeed + "km/h" +
                "\nMaximum person capacity: " + maxPersonCapacity;
    }
}
