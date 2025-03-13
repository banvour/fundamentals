package io.everyonecodes.java.t7_streams.set2.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

public class HappinessSpecialFiveFinderTest {

    private static final String inputFilePath = "src/io/everyonecodes/java/t7_streams/files/world-happiness-2017.csv";
    private final HappinessSpecialFiveFinder finder = new HappinessSpecialFiveFinder();
    private final HappinessDataReader reader = new HappinessDataReader();

    @Test
    void findSpecialFive() throws IOException {
        var data = reader.read(inputFilePath);
        var result = finder.findSpecialFive(data);
        var expected = List.of(
                "Country: Burkina Faso Rank: 134",
                "Country: Afghanistan Rank: 141",
                "Country: Madagascar Rank: 144",
                "Country: South Sudan Rank: 147",
                "Country: Central African Republic Rank: 155"
        );
        Assertions.assertEquals(expected, result);
    }
}
