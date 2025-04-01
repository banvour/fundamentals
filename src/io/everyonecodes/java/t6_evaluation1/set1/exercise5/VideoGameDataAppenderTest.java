package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import org.junit.jupiter.api.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameDataAppenderTest {

    private Path videoGamesFile;
    private Path gameDetailsFile;
    private Path reviewsFile;
    private List<String> beforeVideoGames;
    private List<String> beforeGameDetails;
    private List<String> beforeReviews;

    @BeforeEach
    void setup() throws IOException {
        videoGamesFile = Files.createTempFile("VideoGames", ".csv");
        gameDetailsFile = Files.createTempFile("GameDetails", ".csv");
        reviewsFile = Files.createTempFile("Reviews", ".csv");

        beforeVideoGames = Files.readAllLines(videoGamesFile);
        beforeGameDetails = Files.readAllLines(gameDetailsFile);
        beforeReviews = Files.readAllLines(reviewsFile);
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(videoGamesFile);
        Files.deleteIfExists(gameDetailsFile);
        Files.deleteIfExists(reviewsFile);
    }

    @Test
    void appendMultipleGamesToFiles() throws IOException {
        VideoGameDataAppender writer = new VideoGameDataAppender();

        VideoGame game1 = new VideoGame("100", "First Game", List.of("PC"), 15.0, "RPG", "Dev A", 2022, 90, 9.0);
        VideoGame game2 = new VideoGame("101", "Second Game", List.of("Xbox", "PlayStation"), 20.5, "Shooter", "Dev B", 2021, 88, 8.8);

        writer.appendGameToFile(game1, videoGamesFile.toString(), gameDetailsFile.toString(), reviewsFile.toString());
        writer.appendGameToFile(game2, videoGamesFile.toString(), gameDetailsFile.toString(), reviewsFile.toString());

        List<String> afterVideoGames = Files.readAllLines(videoGamesFile);
        List<String> afterGameDetails = Files.readAllLines(gameDetailsFile);
        List<String> afterReviews = Files.readAllLines(reviewsFile);

        assertEquals(beforeVideoGames.size() + 1, afterVideoGames.size());
        assertEquals(beforeGameDetails.size() + 1, afterGameDetails.size());
        assertEquals(beforeReviews.size() + 1, afterReviews.size());
    }
}
