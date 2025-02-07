package io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise2;

import io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1.Cart;
import io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1.CartItem;
import io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopAssistant {

    public Cart walkThroughShop(String name) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart(new ArrayList<>(), name);

        while (true) {
            System.out.println("Hello " + cart.getCartOwnerName() + ", welcome to our shop!");
            System.out.println("What do you want to buy?");
            String productName = scanner.nextLine();
            if (productName.isEmpty()) {
                break;
            }

            System.out.println("How much does it cost?");
            double price = scanner.nextDouble();
            System.out.println("How many do you want?");
            int amount = scanner.nextInt();

            System.out.println("Thank you, we will put that in the cart!");
            Product product = new Product(productName, price);
            CartItem cartItem = new CartItem(product, amount);
            cart.getCartItems().add(cartItem);
            break;
        }

        System.out.println("Thank you for shopping with us!");

        return cart;
    }
}

