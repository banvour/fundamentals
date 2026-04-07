package io.everyonecodes.java.t11_evaluation2.exercise1;

import java.util.List;

public class TotalOrganicAvocadosSoldIn2016InChicagoAnalyser implements AvocadoAnalyser {
    @Override
    public String analyse(List<AvocadoEntry> entries) {
        double sum = entries.stream()
                .filter(e -> e.getRegion().equalsIgnoreCase("Chicago"))
                .filter(e -> e.getType().equalsIgnoreCase("organic"))
                .filter(e -> e.getYear() == 2016)
                .mapToDouble(AvocadoEntry::getTotalSold)
                .sum();

        if (sum > 0) {
            long rounded = Math.round(sum);
            return "In 2016, the total number of organic avocados sold in the Chicago region was: " + rounded;
        } else {
            return "In 2016, the total number of organic avocados sold in the Chicago region was: Result not found";
        }
    }
}