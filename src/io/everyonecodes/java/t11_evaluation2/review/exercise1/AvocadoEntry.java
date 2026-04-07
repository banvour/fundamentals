package io.everyonecodes.java.t11_evaluation2.review.exercise1;

import java.util.Objects;

public class AvocadoEntry {

    private final String type;
    private final double averagePrice;
    private final double totalSold;
    private final String region;
    private final int year;

    public AvocadoEntry(String type, double averagePrice, double totalSold, String region, int year) {
        this.type = type;
        this.averagePrice = averagePrice;
        this.totalSold = totalSold;
        this.region = region;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public double getTotalSold() {
        return totalSold;
    }

    public String getRegion() {
        return region;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AvocadoEntry)) return false;
        AvocadoEntry that = (AvocadoEntry) o;
        return Double.compare(that.getAveragePrice(), getAveragePrice()) == 0 &&
                Double.compare(that.getTotalSold(), getTotalSold()) == 0 &&
                getYear() == that.getYear() &&
                Objects.equals(getType(), that.getType()) &&
                Objects.equals(getRegion(), that.getRegion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getAveragePrice(), getTotalSold(), getRegion(), getYear());
    }
}
