package io.everyonecodes.java.t8_interfaces.set2.exercise3;

public class AddLeg implements BuildingStep {
    @Override
    public void apply(Furniture furniture) {
        furniture.getParts().add("leg");
    }
}
