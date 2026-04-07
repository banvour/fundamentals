package io.everyonecodes.java.t11_evaluation2.exercise3.attractions;

public class Game {
    private final String title;
    private final String genre;

    public Game(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}
