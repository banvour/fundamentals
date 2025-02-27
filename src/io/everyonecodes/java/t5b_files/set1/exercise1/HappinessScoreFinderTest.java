package io.everyonecodes.java.t5b_files.set1.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessScoreFinderTest {
    private final HappinessScoreFinder finder = new HappinessScoreFinder();

    @ParameterizedTest
    @CsvSource({
            "8.2",
            "7.5",
            "9.0"
    })
    void findFor_returnsScore_whenCountryIsTest(double score) {
        List<HappinessRecord> records = new ArrayList<>();
        records.add(new HappinessRecord("AnyCountry", 1, score));

        Optional<Double> result = finder.findFor(records, "test");

        assertTrue(result.isPresent());
        assertEquals(score, result.get(), 0.0001);
    }

    @ParameterizedTest
    @ValueSource(strings = {"USA", "Germany", "France"})
    void findFor_returnsEmpty_whenCountryIsNotTest(String country) {
        List<HappinessRecord> records = new ArrayList<>();
        records.add(new HappinessRecord("AnyCountry", 1, 8.2));

        Optional<Double> result = finder.findFor(records, country);

        assertFalse(result.isPresent(), "Expected Optional to be empty when country is not 'test'");
    }
}