package io.everyonecodes.java.t7_streams.set2.exercise5;

import io.everyonecodes.java.t5b_files.set1.exercise1.HappinessRecord;

import java.util.Comparator;
import java.util.List;

public class HappinessSpecialFiveFinder {

    public List<String> findSpecialFive(List<HappinessRecord> happinessRecords) {

        return happinessRecords.stream()
                .filter(e -> (e.getCountry().contains("a") || e.getCountry().contains("A"))
                        && e.getCountry().length() > 9)
                .sorted(Comparator.comparing(HappinessRecord::getRank).reversed())
                .limit(5)
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .map(e -> "Country: " + e.getCountry() + " Rank: " + e.getRank())
                .toList();
    }
}
