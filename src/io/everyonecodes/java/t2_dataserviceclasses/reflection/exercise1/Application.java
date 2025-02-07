package io.everyonecodes.java.t2_dataserviceclasses.reflection.exercise1;

public class Application {
    public static void main(String[] args) {
        Product product1 = new Product("banana", 1.50);
        Product product2 = new Product("mango", 5);

        product1.setPricePerUnit(3.50);

//        System.out.println(product1.getPricePerUnit()); <-- for testing

        CartItem cartItem1 = new CartItem(product1, 3);
        CartItem cartItem2 = new CartItem(product2, 100);

        cartItem1.setAmount(5);

//        System.out.println(cartItem1.getAmount()); <-- for testing
    }
}
