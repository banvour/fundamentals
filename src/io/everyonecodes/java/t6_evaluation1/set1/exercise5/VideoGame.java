package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.util.List;
import java.util.Objects;

public class VideoGame {
    private final String id;
    private final String title;
    private final List<String> platforms;
    private final double sales;
    private final String genre;
    private final String developer;
    private final int releaseYear;
    private final int metascore;
    private final double userScore;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoGame videoGame = (VideoGame) o;
        return Double.compare(videoGame.sales, sales) == 0 && releaseYear == videoGame.releaseYear && metascore == videoGame.metascore && Double.compare(videoGame.userScore, userScore) == 0 && Objects.equals(id, videoGame.id) && Objects.equals(title, videoGame.title) && Objects.equals(platforms, videoGame.platforms) && Objects.equals(genre, videoGame.genre) && Objects.equals(developer, videoGame.developer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, platforms, sales, genre, developer, releaseYear, metascore, userScore);
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", platforms=" + platforms +
                ", sales=" + sales +
                ", genre='" + genre + '\'' +
                ", developer='" + developer + '\'' +
                ", releaseYear=" + releaseYear +
                ", metascore=" + metascore +
                ", userScore=" + userScore +
                '}';
    }
}