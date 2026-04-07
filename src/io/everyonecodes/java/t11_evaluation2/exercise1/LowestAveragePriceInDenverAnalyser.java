package io.everyonecodes.java.t11_evaluation2.exercise1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LowestAveragePriceInDenverAnalyser implements AvocadoAnalyser {

    @Override
    public String analyse(List<AvocadoEntry> entries) {
        Optional<AvocadoEntry> lowest = entries.stream()
                .filter(e -> e.getRegion().equalsIgnoreCase("Denver"))
                .min(Comparator.comparingDouble(AvocadoEntry::getAveragePrice));

        if (lowest.isPresent()) {
            double price = lowest.get().getAveragePrice();
            int year = lowest.get().getYear();
            return "Lowest average price in Denver is: " + price + " in " + year;
        } else {
            return "Lowest average price in Denver is: Result not found";
        }
    }
}