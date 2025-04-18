package io.everyonecodes.java.t9_inheritance.reflection;

public class Motorcycle extends Vehicle {
    private boolean hasTopCase;

    public Motorcycle(String brand, int seatAmount, double tankSizeInLiters, double currentAmountOfFuelInTank, boolean hasTopCase) {
        super(brand, seatAmount, tankSizeInLiters, currentAmountOfFuelInTank);
        this.hasTopCase = hasTopCase;
    }

    @Override
    public void refuel() {
        double fuelAdded = getTankSizeInLiters() - getCurrentAmountOfFuelInTank();
        super.refuel();
        System.out.println("Motorcycle tank filled with " + fuelAdded + " liters of fuel.\n" +
                "tank volume: " + getTankSizeInLiters());
    }
}
