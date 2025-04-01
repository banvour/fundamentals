package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameDataReaderTest {
    private Path tempVideoGamesFile;
    private Path tempGameDetailsFile;
    private Path tempReviewsFile;
    private final VideoGameDataReader reader = new VideoGameDataReader();

    @BeforeEach
    void setup() throws IOException {
        tempVideoGamesFile = Files.createTempFile("VideoGames", ".csv");
        tempGameDetailsFile = Files.createTempFile("GameDetails", ".csv");
        tempReviewsFile = Files.createTempFile("Reviews", ".csv");

        Files.writeString(tempVideoGamesFile, "ID;Title;Platforms;Sales\n1;Test Game;PC,PlayStation;10.0\n");
        Files.writeString(tempGameDetailsFile, "ID;Genre;Developer;ReleaseYear\n1;Action;Test Dev;2022\n");
        Files.writeString(tempReviewsFile, "ID;Metascore;UserScore\n1;85;8.5\n");
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(tempVideoGamesFile);
        Files.deleteIfExists(tempGameDetailsFile);
        Files.deleteIfExists(tempReviewsFile);
    }

    @Test
    void testRead() throws IOException {
        List<VideoGame> games = reader.read(
                tempVideoGamesFile.toString(),
                tempGameDetailsFile.toString(),
                tempReviewsFile.toString()
        );

        assertEquals(1, games.size(), "Should read exactly one game");

        VideoGame expectedGame = new VideoGame("1", "Test Game", List.of("PC", "PlayStation"), 10.0, "Action", "Test Dev", 2022, 85, 8.5);
        VideoGame actualGame = games.get(0);

        assertEquals(expectedGame, actualGame);
    }
}
