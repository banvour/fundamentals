package io.everyonecodes.java.t6_evaluation1.review.exercise5;

import java.util.Objects;

public class HeatIceRecord {
    private final int year;
    private final int numberOfHeatDays;
    private final int numberOfIceDays;

    public HeatIceRecord(int year, int numberOfHeatDays, int numberOfIceDays) {
        this.year = year;
        this.numberOfHeatDays = numberOfHeatDays;
        this.numberOfIceDays = numberOfIceDays;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfHeatDays() {
        return numberOfHeatDays;
    }

    public int getNumberOfIceDays() {
        return numberOfIceDays;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HeatIceRecord that = (HeatIceRecord) o;
        return year == that.year && numberOfHeatDays == that.numberOfHeatDays && numberOfIceDays == that.numberOfIceDays;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, numberOfHeatDays, numberOfIceDays);
    }

    @Override
    public String toString() {
        return "HeatIceRecord{" +
                "year=" + year +
                ", numberOfHeatDays=" + numberOfHeatDays +
                ", numberOfIceDays=" + numberOfIceDays +
                '}';
    }
}
