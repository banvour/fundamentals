package io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise2;

import io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1.Cart;
import io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1.CartItem;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ShopAssistant assistant = new ShopAssistant();
        Cart cart1 = new Cart(new ArrayList<>(), "Derek");
        Cart cart2 = new Cart(new ArrayList<>(), "Hansel ");
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
