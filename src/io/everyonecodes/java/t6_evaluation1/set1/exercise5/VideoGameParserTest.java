package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameParserTest {
    private final VideoGameParser parser = new VideoGameParser();

    @Test
    void testParseValidLine() {
        String gameLine = "1;Test Game;PC,PlayStation;10.0";
        String detailsLine = "1;Action;Test Dev;2022";
        String reviewsLine = "1;85;8.5";

        Optional<VideoGame> result = parser.parseLine(gameLine, detailsLine, reviewsLine);

        assertTrue(result.isPresent(), "Game should be parsed successfully");
        VideoGame expected = new VideoGame("1", "Test Game", List.of("PC", "PlayStation"), 10.0, "Action", "Test Dev", 2022, 85, 8.5);
        assertEquals(expected, result.get(), "Parsed game should match expected");
    }

    @Test
    void testParseInvalidLine_tooFewFields() {
        String gameLine = "1;Test Game;PC;10.0";
        String detailsLine = "1;Action";
        String reviewsLine = "1;85";

        Optional<VideoGame> result = parser.parseLine(gameLine, detailsLine, reviewsLine);

        assertFalse(result.isPresent(), "Parsing should fail for an incomplete line");
    }

    @Test
    void testParseInvalidLine_invalidNumbers() {
        String gameLine = "1;Test Game;PC,PlayStation;ten";
        String detailsLine = "1;Action;Test Dev;twenty-twenty";
        String reviewsLine = "1;eighty-five;eight.five";

        Optional<VideoGame> result = parser.parseLine(gameLine, detailsLine, reviewsLine);

        assertFalse(result.isPresent(), "Parsing should fail for a line with invalid number formats");
    }

    @Test
    void testParseValidLine_extraWhitespace() {
        String gameLine = "  2  ;  Another Game  ;  Xbox,PC  ;  20.5  ";
        String detailsLine = "  2  ;  Shooter  ;  Other Dev  ;  2020  ";
        String reviewsLine = "  2  ;  90  ;  9.0  ";

        Optional<VideoGame> result = parser.parseLine(gameLine, detailsLine, reviewsLine);

        assertTrue(result.isPresent(), "Game should be parsed successfully despite extra whitespace");
        VideoGame expected = new VideoGame("2", "Another Game", List.of("Xbox", "PC"), 20.5, "Shooter", "Other Dev", 2020, 90, 9.0);
        assertEquals(expected, result.get(), "Parsed game should match expected");
    }

    @Test
    void testParseInvalidLine_emptyString() {
        String gameLine = "";
        String detailsLine = "";
        String reviewsLine = "";

        Optional<VideoGame> result = parser.parseLine(gameLine, detailsLine, reviewsLine);

        assertFalse(result.isPresent(), "Parsing should fail for empty lines");
    }
}
