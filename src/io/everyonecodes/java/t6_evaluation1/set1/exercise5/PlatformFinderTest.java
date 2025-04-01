package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import io.everyonecodes.java.t6_evaluation1.set1.exercise5.PlatformFinder;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PlatformFinderTest {
    private Path videoGamesFile;
    private Path gameDetailsFile;
    private Path reviewsFile;
    private PlatformFinder platformFinder;

    @BeforeEach
    void setup() throws IOException {
        videoGamesFile = Files.createTempFile("VideoGames", ".csv");
        gameDetailsFile = Files.createTempFile("GameDetails", ".csv");
        reviewsFile = Files.createTempFile("Reviews", ".csv");

        Files.writeString(videoGamesFile,
                "ID;Title;Platforms;Sales\n" +
                        "1;Test Game;PC,PlayStation;10.0\n" +
                        "2;Another Game;Xbox,PC;20.5\n" +
                        "3;Multiplatform Game;PC,PlayStation,Xbox,Nintendo Switch;50.0\n");

        Files.writeString(gameDetailsFile,
                "ID;Genre;Developer;ReleaseYear\n" +
                        "1;Action;Test Dev;2022\n" +
                        "2;Shooter;Other Dev;2020\n" +
                        "3;Adventure;Multidev Studios;2021\n");

        Files.writeString(reviewsFile,
                "ID;Metascore;UserScore\n" +
                        "1;85;8.5\n" +
                        "2;90;9.0\n" +
                        "3;88;8.9\n");

        platformFinder = new PlatformFinder(videoGamesFile.toString(), gameDetailsFile.toString(), reviewsFile.toString());
    }

    @AfterEach
    void cleanup() throws IOException {
        Files.deleteIfExists(videoGamesFile);
        Files.deleteIfExists(gameDetailsFile);
        Files.deleteIfExists(reviewsFile);
    }

    @Test
    void testFindPlatformsFor_existingGame() throws IOException {
        Optional<List<String>> platforms = platformFinder.findPlatformsFor("Test Game");
        assertTrue(platforms.isPresent(), "Platforms should be found");
        assertEquals(List.of("PC", "PlayStation"), platforms.get(), "Platforms should match expected list");
    }

    @Test
    void testFindPlatformsFor_nonExistingGame() throws IOException {
        Optional<List<String>> platforms = platformFinder.findPlatformsFor("Non-Existent Game");
        assertFalse(platforms.isPresent(), "Platforms should not be found for a non-existent game");
    }

    @Test
    void testFindPlatformsFor_gameWithMultiplePlatforms() throws IOException {
        Optional<List<String>> platforms = platformFinder.findPlatformsFor("Multiplatform Game");
        assertTrue(platforms.isPresent(), "Platforms should be found");
        assertEquals(List.of("PC", "PlayStation", "Xbox", "Nintendo Switch"), platforms.get(), "Platforms should match expected list");
    }

    @Test
    void testFindPlatformsFor_caseInsensitiveSearch() throws IOException {
        Optional<List<String>> platforms = platformFinder.findPlatformsFor("test game");
        assertTrue(platforms.isPresent(), "Platforms should be found");
        assertEquals(List.of("PC", "PlayStation"), platforms.get(), "Search should be case insensitive");
    }

    @Test
    void testFindPlatformsFor_partialMatchShouldNotWork() throws IOException {
        Optional<List<String>> platforms = platformFinder.findPlatformsFor("Game");
        assertFalse(platforms.isPresent(), "Partial matches should not return results");
    }
}