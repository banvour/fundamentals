package io.everyonecodes.java.t10_consolidation.exercise1.vehicles.publicTransport;

import java.util.List;

public class Subway extends PublicTransportVehicle {
    private final int numberOfWagons;

    public Subway(double maxSpeed, int maxPersonCapacity, List<Station> stations, int numberOfWagons) {
        super(110, maxPersonCapacity, stations);
        this.numberOfWagons = numberOfWagons;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    @Override
    protected String otherVehicleStats() {
        return "Number of wagons: " + numberOfWagons;
    }

    @Override
    public String getVehicleDescription() {
        return "Subways are the best type of public transportation! Here are my stats:\n" + super.getVehicleDescription();
    }
}
