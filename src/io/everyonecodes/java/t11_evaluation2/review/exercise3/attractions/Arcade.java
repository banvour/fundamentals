package io.everyonecodes.java.t11_evaluation2.review.exercise3.attractions;

import io.everyonecodes.java.t11_evaluation2.review.exercise3.Attraction;

import java.util.List;

public class Arcade extends Attraction {
    private final List<Game> games;

    public Arcade(String name, double entryPrice, int excitementLevel, List<Game> games) {
        super(name, entryPrice, excitementLevel);
        this.games = games;
    }

    public void printGames(List<Game> games) {
//        return "The " + game.getGenre() + game.getTitle() + "!";
    }

    @Override
    public String createAdvertisement() {
        return "Feel like playing some games? Come to " + getName() + ", where we have many games on offer:\n";
    }
}
