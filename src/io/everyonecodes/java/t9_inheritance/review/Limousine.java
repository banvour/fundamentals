package io.everyonecodes.java.t9_inheritance.review;

import java.util.List;

public class Limousine extends Vehicle {
    private final List<String> minibar;

    public Limousine(String brand, int seatAmount, double tankSizeInLiters, double currentAmountOfFuelInTank, List<String> minibar) {
        super(brand, seatAmount, tankSizeInLiters, currentAmountOfFuelInTank);
        this.minibar = minibar;
    }

    public List<String> getMinibar() {
        return minibar;
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Limousine refueled. Drinks restocked: " + minibar);
    }
}
