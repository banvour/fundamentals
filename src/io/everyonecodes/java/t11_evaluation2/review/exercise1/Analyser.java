package io.everyonecodes.java.t11_evaluation2.review.exercise1;

import io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoAnalyser;
import io.everyonecodes.java.t11_evaluation2.exercise1.AvocadoEntry;
import io.everyonecodes.java.t11_evaluation2.exercise1.LowestAveragePriceInDenverAnalyser;
import io.everyonecodes.java.t11_evaluation2.exercise1.TotalOrganicAvocadosSoldIn2016InChicagoAnalyser;

import java.util.List;
import java.util.stream.Collectors;

public class Analyser {
    private final List<AvocadoAnalyser> analysers = List.of(
            new LowestAveragePriceInDenverAnalyser(),
            new TotalOrganicAvocadosSoldIn2016InChicagoAnalyser()
    );

    public List<String> analyse(List<AvocadoEntry> entries) {
        return analysers.stream()
                .map(a -> a.analyse(entries))
                .collect(Collectors.toList());
    }
}