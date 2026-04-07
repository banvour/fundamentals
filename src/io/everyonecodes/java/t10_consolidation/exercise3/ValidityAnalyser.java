package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.List;

public class ValidityAnalyser implements CardSequenceAnalyser {

    @Override
    public String analyse(List<CardSequence> listOfCardSequences) {
        if(listOfCardSequences.isEmpty()) {
            return "Result not found";
        }

        var numberOfValidSequences = listOfCardSequences.stream()
                .filter(CardSequence::isValid)
                .count();

        return "Invalid sequences: " + (listOfCardSequences.size() - numberOfValidSequences) + "\n" +
                "Valid sequences: " + numberOfValidSequences;


    }

    @Override
    public String analyserDescription() {
        return "VALIDITIES OF THE CARD SEQUENCES";
    }
}