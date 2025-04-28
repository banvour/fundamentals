package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.Arrays;
import java.util.Optional;

public class CardParser {
    public Optional<Card> parse(String cardAsString) {
        String[] splitString = cardAsString.split(",");
        return Arrays.stream(Color.values())
                .filter(e -> e.getStringRepresentation().equals(splitString[0]))
                .map(e -> new Card(Integer.parseInt(splitString[1]), e))
                .findFirst();
    }
}