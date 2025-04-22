package io.everyonecodes.java.t10_consolidation.exercise1.vehicles;

public abstract class Car extends Vehicle{
    private final String modelName;

    public Car(double maxSpeed, int maxPersonCapacity, String modelName) {
        super(maxSpeed, maxPersonCapacity);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String getVehicleDescription() {
        return "This is a car, the brand new " + modelName + ". Here are the basic facts: \n It reaches speeds up to " + getMaxSpeed() + "km/h and can carry up to " + getMaxPersonCapacity() + " people.";
    }
}
