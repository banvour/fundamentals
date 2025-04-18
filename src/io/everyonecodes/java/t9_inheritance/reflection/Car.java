package io.everyonecodes.java.t9_inheritance.reflection;

public abstract class Car extends Vehicle {
    private final int doorAmount;

    public Car(String brand, int seatAmount, double tankSizeInLiters, double currentAmountOfFuelInTank, int doorAmount) {
        super(brand, seatAmount, tankSizeInLiters, currentAmountOfFuelInTank);
        this.doorAmount = doorAmount;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

}
