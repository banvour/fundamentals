package io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> cartItems = new ArrayList<>();
    private String cartOwnerName;

    public Cart(List<CartItem> cartItems, String cartOwnerName) {
        this.cartItems = cartItems;
        this.cartOwnerName = cartOwnerName;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public String getCartOwnerName() {
        return cartOwnerName;
    }
}
