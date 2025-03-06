package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.util.List;

public class VideoGame {
    private String id;
    private String title;
    private List<String> platforms;
    private double sales;
    private String genre;
    private String developer;
    private int releaseYear;
    private int metascore;
    private double userScore;

    public VideoGame(String id, String title, List<String> platforms, double sales, String genre, String developer, int releaseYear, int metascore, double userScore) {
        this.id = id;
        this.title = title;
        this.platforms = platforms;
        this.sales = sales;
        this.genre = genre;
        this.developer = developer;
        this.releaseYear = releaseYear;
        this.metascore = metascore;
        this.userScore = userScore;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getPlatforms() {
        return platforms;
    }

    public double getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getMetascore() {
        return metascore;
    }

    public double getUserScore() {
        return userScore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public void setUserScore(double userScore) {
        this.userScore = userScore;
    }

    public double calculateAverageScore() {
        return (metascore + userScore) / 2.0;
    }
}
