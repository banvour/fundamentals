package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class PlatformFinder {
    private final VideoGameDataReader reader;
    private final String videoGamesPath;
    private final String gameDetailsPath;
    private final String reviewsPath;

    public PlatformFinder(String videoGamesPath, String gameDetailsPath, String reviewsPath) {
        this.reader = new VideoGameDataReader();
        this.videoGamesPath = videoGamesPath;
        this.gameDetailsPath = gameDetailsPath;
        this.reviewsPath = reviewsPath;
    }

    public Optional<List<String>> findPlatformsFor(String title) throws IOException {
        List<VideoGame> games = reader.read(videoGamesPath, gameDetailsPath, reviewsPath);

        for (VideoGame game : games) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(game.getPlatforms());
            }
        }
        return Optional.empty();
    }
}
