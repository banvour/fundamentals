package io.everyonecodes.java.t7_streams.reflection.exercise1;

import java.util.Objects;

public class StudentPerformance {
    private final String gender;
    private final String parentalEducation;
    private final double mathScore;
    private final double readingScore;
    private final double writingScore;

    public StudentPerformance(String gender, String parentalEducation, double mathScore, double readingScore, double writingScore) {
        this.gender = gender;
        this.parentalEducation = parentalEducation;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
    }

    public String getGender() {
        return gender;
    }

    public String getParentalEducation() {
        return parentalEducation;
    }

    public double getMathScore() {
        return mathScore;
    }

    public double getReadingScore() {
        return readingScore;
    }

    public double getWritingScore() {
        return writingScore;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentPerformance that = (StudentPerformance) o;
        return Double.compare(mathScore, that.mathScore) == 0 && Double.compare(readingScore, that.readingScore) == 0 && Double.compare(writingScore, that.writingScore) == 0 && Objects.equals(gender, that.gender) && Objects.equals(parentalEducation, that.parentalEducation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, parentalEducation, mathScore, readingScore, writingScore);
    }

    @Override
    public String toString() {
        return "StudentPerformance{" +
                "gender='" + gender + '\'' +
                ", parentalEducation='" + parentalEducation + '\'' +
                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                '}';
    }
}
