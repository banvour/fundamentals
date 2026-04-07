package io.everyonecodes.java.t11_evaluation2.review.exercise3.attractions;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("The White Whale", 0.0, 3, List.of(
                new Dish("Salmon Sandwich", 4.99),
                new Dish("Tuna Sandwich", 4.99),
                new Dish("Fish & Chips", 8.99)
        ));

        System.out.println(restaurant.createAdvertisement());
    }
}
