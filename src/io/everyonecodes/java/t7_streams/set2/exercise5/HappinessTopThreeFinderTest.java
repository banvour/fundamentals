package io.everyonecodes.java.t7_streams.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class HappinessTopThreeFinderTest {

    private static final String inputFilePath = "src/io/everyonecodes/java/t7_streams/files/world-happiness-2017.csv";
    private final HappinessTopThreeFinder finder = new HappinessTopThreeFinder();
    private final HappinessDataReader reader = new HappinessDataReader();

    @Test
    void findTopThree() throws IOException {
        var data = reader.read(inputFilePath);
        var result = finder.findTopThree(data);
        var expected = List.of(
                "Country: Norway Score: 7.53700017929077",
                "Country: Denmark Score: 7.52199983596802",
                "Country: Iceland Score: 7.50400018692017"
        );
        Assertions.assertEquals(expected, result);
    }
}
