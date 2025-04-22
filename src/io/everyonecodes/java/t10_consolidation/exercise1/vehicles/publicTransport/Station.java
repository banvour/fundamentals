package io.everyonecodes.java.t10_consolidation.exercise1.vehicles.publicTransport;

public class Station {
    private final String name;
    private final double latitude;
    private final double longitude;

    public Station(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getDescription() {
        return String.format("Station Name: %s, Latitude: %.2f, Longitude: %.2f", name, latitude, longitude);
    }
}
