package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.util.ArrayList;
import java.util.List;

public class VideoGameAnalyzer {

    public double calculateAverageScore(VideoGame game) {
        return game.calculateAverageScore();
    }

    public String findTopDeveloper(List<VideoGame> games) {
        String topDeveloper = null;
        double highestAvgScore = -1;

        List<String> developers = games.stream()
                .map(VideoGame::getDeveloper)
                .distinct()
                .toList();

        for (String developer : developers) {
            double totalScore = 0;
            int count = 0;
            for (VideoGame game : games) {
                if (game.getDeveloper().equals(developer)) {
                    totalScore += game.calculateAverageScore();
                    count++;
                }
            }
            double avgScore = count > 0 ? totalScore / count : 0;
            if (avgScore > highestAvgScore) {
                highestAvgScore = avgScore;
                topDeveloper = developer;
            }
        }
        return topDeveloper;
    }

    public List<String> findSupportedPlatforms(String gameTitle, List<VideoGame> games) {
        List<String> platforms = new ArrayList<>();
        for (VideoGame game : games) {
            if (game.getTitle().equalsIgnoreCase(gameTitle)) {
                for (String platform : game.getPlatforms()) {
                    if (!platforms.contains(platform)) {
                        platforms.add(platform);
                    }
                }
            }
        }
        return platforms;
    }
}
