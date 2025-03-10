package io.everyonecodes.java.t5_optionals_exceptions.reflection;

public class Song {
    private String title;
    private double durationInSec;
    private double rating;

    public Song(String title, double durationInSec, double rating) {
        this.title = title;
        this.durationInSec = durationInSec;
        this.rating = rating;
    }

    public double getDurationInSec() {
        return durationInSec;
    }

    public double getRating() {
        return rating;
    }
}
