package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VideoGameAnalyzerTest {

    private final VideoGameAnalyzer analyzer = new VideoGameAnalyzer();

    @Test
    public void testCalculateAverageScore() {
        VideoGame game = new VideoGame("1", "Test Game", List.of("PC"), 1000,
                "Action", "DevA", 2020, 80, 70.0);
        assertEquals(75.0, analyzer.calculateAverageScore(game), 0.001);
    }

    @Test
    public void testFindTopDeveloper() {
        VideoGame game1 = new VideoGame("1", "Game1", List.of("PC"), 1000, "Action", "DevA", 2020, 80, 70.0); // avg = 75
        VideoGame game2 = new VideoGame("2", "Game2", List.of("Xbox"), 2000, "Adventure", "DevA", 2021, 90, 80.0); // avg = 85
        VideoGame game3 = new VideoGame("3", "Game3", List.of("PC"), 1500, "RPG", "DevB", 2019, 60, 50.0); // avg = 55
        List<VideoGame> games = Arrays.asList(game1, game2, game3);

        assertEquals("DevA", analyzer.findTopDeveloper(games));
    }

    @Test
    public void testFindSupportedPlatforms() {
        VideoGame game1 = new VideoGame("1", "Game1", List.of("PC", "Xbox"), 1000, "Action", "DevA", 2020, 80, 70.0);
        VideoGame game2 = new VideoGame("2", "Game1", List.of("PlayStation"), 1500, "Action", "DevA", 2020, 80, 70.0);
        VideoGame game3 = new VideoGame("3", "Game2", List.of("PC"), 1200, "Action", "DevB", 2021, 80, 70.0);
        List<VideoGame> games = List.of(game1, game2, game3);

        List<String> platforms = analyzer.findSupportedPlatforms("Game1", games);
        assertTrue(platforms.contains("PC"));
        assertTrue(platforms.contains("Xbox"));
        assertTrue(platforms.contains("PlayStation"));
        assertEquals(3, platforms.size());
    }
}
