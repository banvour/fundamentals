package io.everyonecodes.java.t7_streams.set2.exercise5;

import io.everyonecodes.java.t5b_files.set1.exercise1.HappinessRecord;

import java.util.Comparator;
import java.util.List;

public class HappinessTopThreeFinder {

    public List<String> findTopThree(List<HappinessRecord> happinessRecords) {

        return happinessRecords.stream()
                .sorted(Comparator.comparing(HappinessRecord::getRank))
                .limit(3)
                .map(e -> "Country: " + e.getCountry() + " Score: " + e.getScore())
                .toList();
    }
}
