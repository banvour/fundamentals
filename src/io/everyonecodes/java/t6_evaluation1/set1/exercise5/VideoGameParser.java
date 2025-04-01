package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VideoGameParser {

    public Optional<VideoGame> parseLine(String gameLine, String detailsLine, String reviewsLine) {
        try {
            if (gameLine == null || detailsLine == null || reviewsLine == null ||
                    gameLine.isBlank() || detailsLine.isBlank() || reviewsLine.isBlank()) {
                return Optional.empty();
            }

            String[] gameParts = gameLine.split(";");
            if (gameParts.length < 4) {
                return Optional.empty();
            }
            String id = gameParts[0].trim();
            String title = gameParts[1].replace("\"", "").trim();
            List<String> platforms = Arrays.asList(gameParts[2].replace("\"", "").trim().split(","));
            double sales = Double.parseDouble(gameParts[3].trim());

            String[] detailsParts = detailsLine.split(";");
            if (detailsParts.length < 4) {
                return Optional.empty();
            }
            String genre = detailsParts[1].trim();
            String developer = detailsParts[2].trim();
            int releaseYear = Integer.parseInt(detailsParts[3].trim());

            String[] reviewsParts = reviewsLine.split(";");
            if (reviewsParts.length < 3) {
                return Optional.empty();
            }
            int metascore = Integer.parseInt(reviewsParts[1].trim());
            double userScore = Double.parseDouble(reviewsParts[2].trim());

            return Optional.of(new VideoGame(id, title, platforms, sales, genre, developer, releaseYear, metascore, userScore));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Skipping invalid lines due to parsing error: " + e.getMessage());
            return Optional.empty();
        }
    }
}
