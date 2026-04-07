package io.everyonecodes.java.t10_consolidation.exercise1.vehicles.publicTransport;

import java.util.List;

public class Bus extends PublicTransportVehicle {
    private final boolean hasOverheadLine;

    public Bus(double maxSpeed, int maxPersonCapacity, List<Station> stations, boolean hasOverheadLine) {
        super(80, 50, stations);
        this.hasOverheadLine = hasOverheadLine;
    }

    public boolean isHasOverheadLine() {
        return hasOverheadLine;
    }

    @Override
    protected String otherVehicleStats() {
        return "Overhead line: " + (hasOverheadLine ? "Available" : "Not available");
    }

    @Override
    public String getVehicleDescription() {
        return "I'm a bus. Here is some more information about me:\n" + super.getVehicleDescription();
    }
}
