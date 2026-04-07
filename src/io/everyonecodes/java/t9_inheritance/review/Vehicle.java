package io.everyonecodes.java.t9_inheritance.review;

public abstract class Vehicle {
    private final String brand;
    private final int seatAmount;
    private final double tankSizeInLiters;
    private double currentAmountOfFuelInTank;

    public Vehicle(String brand, int seatAmount, double tankSizeInLiters, double currentAmountOfFuelInTank) {
        this.brand = brand;
        this.seatAmount = seatAmount;
        this.tankSizeInLiters = tankSizeInLiters;
        this.currentAmountOfFuelInTank = currentAmountOfFuelInTank;
    }

    public String getBrand() {
        return brand;
    }

    public int getSeatAmount() {
        return seatAmount;
    }

    public double getTankSizeInLiters() {
        return tankSizeInLiters;
    }

    public double getCurrentAmountOfFuelInTank() {
        return currentAmountOfFuelInTank;
    }

    public void refuel() {
        this.currentAmountOfFuelInTank = this.tankSizeInLiters;
    }
}
