package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.Comparator;
import java.util.List;

public class HighestNumberOfRed2CardsAnalyser implements CardSequenceAnalyser {


    @Override
    public String analyse(List<CardSequence> listOfCardSequences) {

        return listOfCardSequences.stream()
                .map(e -> e.countCardOccurences(new Card(2, Color.RED)))
                .max(Comparator.naturalOrder())
                .map(e -> "RED(2) appears at most " + e + " time(s) in a single sequence.")
                .orElse("Result not found");
    }

    @Override
    public String analyserDescription() {
        return "MOST OCCURRENCES OF RED(2) CARD IN ONE SEQUENCE";
    }
}