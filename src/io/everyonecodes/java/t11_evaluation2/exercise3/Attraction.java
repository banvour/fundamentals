package io.everyonecodes.java.t11_evaluation2.exercise3;

public abstract class Attraction {
    private final String name;
    private final double entryPrice;
    private final int excitementLevel ;

    public Attraction(String name, double entryPrice, int excitementLevel) {
        this.name = name;
        this.entryPrice = entryPrice;
        this.excitementLevel = excitementLevel;
    }

    public String getName() {
        return name;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public int getExcitementLevel() {
        return excitementLevel;
    }

    public String createAdvertisement() {
        return "";
    }
}
