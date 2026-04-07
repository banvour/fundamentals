package io.everyonecodes.java.t11_evaluation2.exercise3.attractions;

import io.everyonecodes.java.t11_evaluation2.exercise3.Attraction;

import java.util.List;
import java.util.stream.Collectors;

public class Arcade extends Attraction {
    private final List<Game> games;

    public Arcade(String name, double entryPrice, int excitementLevel, List<Game> games) {
        super(name, entryPrice, excitementLevel);
        this.games = games;
    }

    @Override
    public String createAdvertisement() {
        var gamesAdvertisement = games.stream()
                .map(e -> "    The " + e.getGenre() + " game " + e.getTitle() + "!")
                .collect(Collectors.joining("\n"));
        return "Feel like playing some games? Come to " + getName() + ", where we have many games on offer:\n" + gamesAdvertisement;
    }
}
