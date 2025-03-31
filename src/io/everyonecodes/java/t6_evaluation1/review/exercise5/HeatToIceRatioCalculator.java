package io.everyonecodes.java.t6_evaluation1.review.exercise5;

import java.util.ArrayList;
import java.util.List;

public class HeatToIceRatioCalculator {

    public List<Double> calculate(List<HeatIceRecord> records) {
        List<Double> ratios = new ArrayList<>();
        for (HeatIceRecord record : records) {
            int heat = record.getNumberOfHeatDays();
            int ice = record.getNumberOfIceDays();

        }
        return ratios;
    }
}
