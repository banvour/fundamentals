package io.everyonecodes.java.t11_evaluation2.exercise3.attractions;

import io.everyonecodes.java.t11_evaluation2.exercise3.Attraction;

import java.util.List;

public class Restaurant extends Attraction {
    private final List<Dish> dishes;

    public Restaurant(String name, double entryPrice, int excitementLevel, List<Dish> dishes) {
        super(name, entryPrice, excitementLevel);
        this.dishes = dishes;
    }

    @Override
    public String createAdvertisement() {
        return "Feeling hungry? Come to " + getName() + "! We have amazing dishes on our menu:\n"
                + dishes;
    }
}
