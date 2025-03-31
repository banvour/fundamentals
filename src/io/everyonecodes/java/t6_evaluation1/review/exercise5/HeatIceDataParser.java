package io.everyonecodes.java.t6_evaluation1.review.exercise5;

import java.util.List;

public class HeatIceDataParser {

    public HeatIceRecord parseLine(String line) {
        if (line.isEmpty()) {
            System.out.println("empty line");
        }

        List<String> splitLines = List.of(line.split(","));
        int year = Integer.parseInt(splitLines.get(0));
        int numberOfHeatDays = Integer.parseInt(splitLines.get(1));
        int numberOfIceDays = Integer.parseInt(splitLines.get(2));

        return new HeatIceRecord(year, numberOfHeatDays, numberOfIceDays);
    }
}