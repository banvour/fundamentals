package io.everyonecodes.java.t10_consolidation.exercise1.vehicles.publicTransport;

import io.everyonecodes.java.t10_consolidation.exercise1.vehicles.Vehicle;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.stream.Collectors;

public abstract class PublicTransportVehicle extends Vehicle {
    private final List<Station> stations;

    public PublicTransportVehicle(double maxSpeed, int maxPersonCapacity, List<Station> stations) {
        super(maxSpeed, maxPersonCapacity);
        this.stations = stations;
    }

    protected abstract String otherVehicleStats();

    public String getStationsDescription() {
        return"==Stations==\n" +
                stations.stream()
                        .map(Station::getDescription)
                        .collect(Collectors.joining("\n"));
    }

    @Override
    public String getVehicleDescription() {
        return super.getVehicleDescription() + "\n"
                + otherVehicleStats() + "\n"
                + getStationsDescription();
    }
}
