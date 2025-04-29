package io.everyonecodes.java.t11_evaluation2.exercise3;

import io.everyonecodes.java.t11_evaluation2.exercise3.attractions.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Attraction> listOfAttractions = List.of(
                new RollerCoaster("Great Mindbuster", 5.6, 5, 200),
                new SpookyRollerCoaster("Pirate's Curse", 3.5, 5, 15, 2),
                new SpookyRollerCoaster("Ride of the Walking Dead", 5, 5, 60, 11),
                new SpookyRollerCoaster("Dracula's Lair", 4.5, 5, 60, 5),
                new Restaurant("The White Whale", 0, 5, List.of(new Dish("Salmon Sandwich", 4.99), new Dish("Tuna Sandwich", 4.99), new Dish("Fish & Chips", 8.99))),
                new Arcade("Gamer's Grove", 0, 5, List.of(new Game("House of the Damned", "action"), new Game("Kitty's Rescue", "platformer"), new Game("SpeedyCars", "racing")))
        );

        final AttractionAdvertiser attractionAdvertiser = new AttractionAdvertiser();
        attractionAdvertiser.advertise(listOfAttractions);
    }
}
