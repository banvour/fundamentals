package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class CardSequenceParser {
    private final CardParser cardParser = new CardParser();


    public CardSequence parse(String cardSequenceAsString) {
        return new CardSequence(Arrays.stream(cardSequenceAsString.split(";"))
                .map(cardParser::parse)
                .flatMap(Optional::stream)
                .collect(Collectors.toList())
        );
    }
}