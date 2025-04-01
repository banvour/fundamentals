package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class VideoGameDataAppender {

    public void appendGameToFile(VideoGame game, String videoGamesFile, String gameDetailsFile, String reviewsFile) throws IOException {
        if (isInvalidGame(game)) {
            return;
        }

        Path videoGamesPath = Path.of(videoGamesFile);
        Path gameDetailsPath = Path.of(gameDetailsFile);
        Path reviewsPath = Path.of(reviewsFile);

        String videoGameLine = game.getId() + ";" + game.getTitle() + ";" + String.join(",", game.getPlatforms()) + ";" + game.getSales();
        Files.write(videoGamesPath, videoGameLine.getBytes(), StandardOpenOption.APPEND);

        String gameDetailsLine = game.getId() + ";" + game.getGenre() + ";" + game.getDeveloper() + ";" + game.getReleaseYear();
        Files.write(gameDetailsPath, gameDetailsLine.getBytes(), StandardOpenOption.APPEND);

        if (game.getMetascore() > 0 || game.getUserScore() > 0.0) {
            String reviewLine = game.getId() + ";" + game.getMetascore() + ";" + game.getUserScore();
            Files.write(reviewsPath, reviewLine.getBytes(), StandardOpenOption.APPEND);
        }
    }

    private boolean isInvalidGame(VideoGame game) {
        return game.getId().isBlank() ||
                game.getTitle().isBlank() ||
                game.getPlatforms().isEmpty() ||
                game.getGenre().isBlank() ||
                game.getDeveloper().isBlank() ||
                game.getReleaseYear() == 0;
    }
}
