package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise5;

public class ShoeCustomer {
    private double size;

    public ShoeCustomer(double size) {
        this.size = size;
    }

    public boolean tryShoe(Shoe shoe) {
        return shoe.getSize() == this.size;
    }
}
