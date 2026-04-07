package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.List;

public class TotalNumberOfBlue6CardsAnalyser implements CardSequenceAnalyser {
    @Override
    public String analyse(List<CardSequence> listOfCardSequences) {

        return listOfCardSequences.stream()
                .map(e -> e.countCardOccurences(new Card(6, Color.BLUE)))
                .reduce(Integer::sum)
                .map(e -> "BLUE(6) occurs " + e + " time(s) in total.")
                .orElse("Result not found");
    }

    @Override
    public String analyserDescription() {
        return "TOTAL NUMBER OF OCCURRENCES OF BLUE(6) CARD";
    }
}