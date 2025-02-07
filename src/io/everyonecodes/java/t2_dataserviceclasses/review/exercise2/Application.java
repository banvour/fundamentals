package io.everyonecodes.java.t2_dataserviceclasses.review.exercise2;

import io.everyonecodes.java.t2_dataserviceclasses.review.exercise1.Cart;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShopAssistant assistant = new ShopAssistant();
        Cart cart1 = assistant.walkThroughShop("Derek");
        Cart cart2 = assistant.walkThroughShop("Hansel");



        List<Cart> carts = new ArrayList<>(List.of(cart1, cart2));

        for (Cart cart : carts) {
            assistant.walkThroughShop(cart.getCartOwnerName());
        }

        Cashier cashier = new Cashier();

        for (Cart cart : carts) {
            cashier.billCustomer(cart);
        }
    }
}
