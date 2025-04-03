package io.everyonecodes.java.t7b_datastructures.mixed.exercise2;

public enum Weather {
    SUNNY("sunny"),
    CLOUDY("cloudy"),
    RAINY("rainy"),
    SNOWY("snowy"),
    STORMY("stormy");

    private final String description;

    Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
