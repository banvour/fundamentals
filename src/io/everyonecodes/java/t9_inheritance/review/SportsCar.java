package io.everyonecodes.java.t9_inheritance.review;

public class SportsCar extends Car {
    private final boolean hasNitro;

    public SportsCar(String brand, int seatAmount, double tankSizeInLiters, double currentAmountOfFuelInTank, int doorAmount, boolean hasNitro) {
        super(brand, seatAmount, tankSizeInLiters, currentAmountOfFuelInTank, doorAmount);
        this.hasNitro = hasNitro;
    }

    public boolean isHasNitro() {
        return hasNitro;
    }

    @Override
    public void refuel() {
        super.refuel();
        if (hasNitro) {
            System.out.println("Sports car tank refueled. Nitro system also refueled.");
        } else {
            System.out.println("Sports car tank refueled.");
        }
    }
}
