package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise5;

public class Application {
    public static void main(String[] args) {
        ShoeCustomer customer1 = new ShoeCustomer(38);
        ShoeCustomer customer2 = new ShoeCustomer(42);

        ShopAssistant assistant = new ShopAssistant();

        assistant.findShoeForCustomer(customer1);
        assistant.findShoeForCustomer(customer2);
    }
}
