package io.everyonecodes.java.t10_consolidation.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<CardSequenceAnalyser> cardSequenceAnalysers = List.of(new ValidityAnalyser(), new HighestNumberOfRed2CardsAnalyser(), new TotalNumberOfBlue6CardsAnalyser());

        final CardSequenceReader cardSequenceReader = new CardSequenceReader();

        List<List<CardSequence>> listOfListOfCardSequences = List.of(
                List.of(),
                cardSequenceReader.read()
        );

        for (List<CardSequence> listOfCardSequence : listOfListOfCardSequences) {
            for (CardSequenceAnalyser cardSequenceAnalyser : cardSequenceAnalysers) {
                System.out.println(cardSequenceAnalyser.analyserDescription());
                System.out.println(cardSequenceAnalyser.analyse(listOfCardSequence));
            }
            System.out.println();
        }
    }
}