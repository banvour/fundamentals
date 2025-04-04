package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.*;

class TopDeveloperFinderTest {
    private final TopDeveloperFinder topDeveloperFinder = new TopDeveloperFinder();
    private final List<VideoGame> games = List.of(
            new VideoGame("1", "Game A", List.of("PC"), 10.0, "Action", "Dev A", 2021, 80, 8.0),
            new VideoGame("2", "Game B", List.of("Xbox"), 15.0, "RPG", "Dev A", 2019, 70, 7.0),
            new VideoGame("3", "Game C", List.of("PlayStation"), 20.0, "Shooter", "Dev B", 2022, 90, 9.0)
    );

    @Test
    void testCalculateAverageScore() {
        Optional<Double> result = topDeveloperFinder.calculateAverageScore(games);

        assertTrue(result.isPresent());
        assertEquals(80.0, result.get(), 0.00001);
    }

    @Test
    void testCalculateAverageScore_emptyList() {
        List<VideoGame> games = List.of();
        Optional<Double> result = topDeveloperFinder.calculateAverageScore(games);
        assertFalse(result.isPresent());
    }

    @Test
    void testFindTopDeveloperByAverageScore() {
        Optional<String> result = topDeveloperFinder.findTopDeveloperByAverageScore(games);

        assertTrue(result.isPresent());
        assertEquals("Dev B", result.get());
    }

    @Test
    void testFindTopDeveloperByAverageScore_emptyList() {
        List<VideoGame> games = List.of();
        Optional<String> result = topDeveloperFinder.findTopDeveloperByAverageScore(games);
        assertFalse(result.isPresent());
    }
}
