package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {

    public void findShoeForCustomer(ShoeCustomer customer) {
        List<Shoe> availableShoes = new ArrayList<>(List.of(
                new Shoe(39, "pink"),
                new Shoe(40, "red"),
                new Shoe(38, "blue"),
                new Shoe(42, "black")
        ));

        for (Shoe shoe : availableShoes) {
            if (customer.tryShoe(shoe)) {
                System.out.println("I will take the " + shoe.getColor() + " one!");
                break;
            } else {
                System.out.println("Nope, this one doesn’t fit, sorry!");
            }
        }

    }
}
