package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VideoGameDataReader {
    private final VideoGameParser parser = new VideoGameParser();

    public List<VideoGame> read(String videoGamesFile, String gameDetailsFile, String reviewsFile) {
        List<VideoGame> games = new ArrayList<>();
        try {
            List<String> gameLines = Files.readAllLines(Path.of(videoGamesFile));
            List<String> detailsLines = Files.readAllLines(Path.of(gameDetailsFile));
            List<String> reviewsLines = Files.readAllLines(Path.of(reviewsFile));

            int minSize = Math.min(gameLines.size(), Math.min(detailsLines.size(), reviewsLines.size()));
            for (int i = 1; i < minSize; i++) {
                Optional<VideoGame> game = parser.parseLine(gameLines.get(i), detailsLines.get(i), reviewsLines.get(i));
                if (game.isPresent()) {
                    games.add(game.get());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
        return games;
    }
}
