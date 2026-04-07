package io.everyonecodes.java.t11_evaluation2.exercise3.attractions;

import io.everyonecodes.java.t11_evaluation2.exercise3.Attraction;

public class RollerCoaster extends Attraction {
    private final double maxSpeed;

    public RollerCoaster(String name, double entryPrice, int excitementLevel, double maxSpeed) {
        super(name, entryPrice, excitementLevel);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String createAdvertisement() {
        return "Come and ride the amazing " + getName() + ", going at a maximum speed of " + maxSpeed + "km/h! Only " + getEntryPrice() + "€!";
    }
}