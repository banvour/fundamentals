package io.everyonecodes.java.t5b_files.set1.exercise1;

import java.util.Objects;

public class HappinessRecord {
    private final String country;
    private final int rank;
    private final double score;

    public HappinessRecord(String country, int rank, double score) {
        this.country = country;
        this.rank = rank;
        this.score = score;
    }

    public String getCountry() {
        return country;
    }

    public int getRank() {
        return rank;
    }

    public double getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HappinessRecord record = (HappinessRecord) o;
        return rank == record.rank && Double.compare(score, record.score) == 0 && Objects.equals(country, record.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, rank, score);
    }
}
