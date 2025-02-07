package io.everyonecodes.java.t2_dataserviceclasses.review.exercise2;

import io.everyonecodes.java.t2_dataserviceclasses.review.exercise1.Cart;
import io.everyonecodes.java.t2_dataserviceclasses.review.exercise1.CartItem;

public class Cashier {

    public void billCustomer(Cart cart) {
        double totalPrice = 0;

        for (CartItem cartItem : cart.getCartItems()) {
            totalPrice += cartItem.getAmount() * cartItem.getProduct().getPricePerUnit();
        }

        System.out.println((cart.getCartOwnerName() + " has to pay " + totalPrice + " Euros."));
    }
}
