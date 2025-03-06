package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VideoGameRepository {

    private static final String VIDEO_GAMES_FILE = "src/io/everyonecodes/java/t6_evaluation1/files/VideoGames.csv";
    private static final String GAME_DETAILS_FILE = "src/io/everyonecodes/java/t6_evaluation1/files/GameDetails.csv";
    private static final String REVIEWS_FILE = "src/io/everyonecodes/java/t6_evaluation1/files/Reviews.csv";

    public List<VideoGame> readAllGames() {
        List<VideoGame> games = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(VIDEO_GAMES_FILE));

            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = line.split(",");
                if (parts.length < 7) continue;

                String id = parts[0].trim();
                String title = parts[1].trim();
                List<String> platforms = Arrays.asList(parts[2].trim().split(";"));
                double sales = Double.parseDouble(parts[3].trim());
                String genre = parts[4].trim();
                String developer = parts[5].trim();
                int releaseYear = Integer.parseInt(parts[6].trim());

                VideoGame game = new VideoGame(id, title, platforms, sales, genre, developer, releaseYear, 0, 0.0);
                games.add(game);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(GAME_DETAILS_FILE));
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = line.split(",");
                if (parts.length < 2) continue;
                String id = parts[0].trim();
                int metascore = parts[1].trim().isEmpty() ? 0 : Integer.parseInt(parts[1].trim());

                for (VideoGame game : games) {
                    if (game.getId().equals(id)) {
                        game.setMetascore(metascore);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<String> lines = Files.readAllLines(Paths.get(REVIEWS_FILE));
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] parts = line.split(",");
                if (parts.length < 2) continue;
                String id = parts[0].trim();
                double userScore = parts[1].trim().isEmpty() ? 0.0 : Double.parseDouble(parts[1].trim());
                for (VideoGame game : games) {
                    if (game.getId().equals(id)) {
                        game.setUserScore(userScore);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return games;
    }

    public boolean insertVideoGame(VideoGame game) {
        if (game.getId().isEmpty() ||
                game.getTitle().isEmpty() ||
                game.getPlatforms().isEmpty() ||
                game.getGenre().isEmpty() ||
                game.getDeveloper().isEmpty() ||
                game.getReleaseYear() <= 0) {
            return false;
        }

        try {
            String videoGameRecord = String.join(",",
                    game.getId(),
                    game.getTitle(),
                    String.join(";", game.getPlatforms()),
                    String.valueOf(game.getSales()),
                    game.getGenre(),
                    game.getDeveloper(),
                    String.valueOf(game.getReleaseYear())
            );
            Files.write(Paths.get(VIDEO_GAMES_FILE),
                    (videoGameRecord + System.lineSeparator()).getBytes(),
                    StandardOpenOption.APPEND);

            String gameDetailsRecord = game.getId() + "," + game.getMetascore();
            Files.write(Paths.get(GAME_DETAILS_FILE),
                    (gameDetailsRecord + System.lineSeparator()).getBytes(),
                    StandardOpenOption.APPEND);

            String reviewsRecord = game.getId() + "," + game.getUserScore();
            Files.write(Paths.get(REVIEWS_FILE),
                    (reviewsRecord + System.lineSeparator()).getBytes(),
                    StandardOpenOption.APPEND);

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
