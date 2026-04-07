package io.everyonecodes.java.t11_evaluation2.exercise3.attractions;

public class SpookyRollerCoaster extends RollerCoaster {
    private final int spookynessLevel;

    public SpookyRollerCoaster(String name, double entryPrice, int excitementLevel, double maxSpeed, int spookynessLevel) {
        super(name, entryPrice, excitementLevel, maxSpeed);
        this.spookynessLevel = spookynessLevel;
    }

    @Override
    public String createAdvertisement() {
        boolean isSpooky = spookynessLevel >= 10;
        boolean isFamilyFriendly = spookynessLevel <= 3;

        if (isFamilyFriendly) {
            System.out.println("Families, come and join us, on the frighteningly fun " + getName() + "! It's only " + getEntryPrice() + "€!");
        } else if (isSpooky) {
            System.out.println("Are you brave enough to ride the scaaaary " + getName() + "? It is extremely spooky, so only come if you have a strong heart!");
        }
        return super.createAdvertisement();
    }
}