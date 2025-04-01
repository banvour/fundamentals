package io.everyonecodes.java.t6_evaluation1.set1.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class TopDeveloperFinder {

    public Optional<Double> calculateAverageScore(List<VideoGame> games) {
        double totalScore = 0;
        int count = 0;

        for (VideoGame game : games) {
            double meta = game.getMetascore();
            double user = game.getUserScore() * 10;

            if (meta > 0 && user > 0) {
                totalScore += (meta + user) / 2.0;
                count++;
            } else if (meta > 0) {
                totalScore += meta;
                count++;
            } else if (user > 0) {
                totalScore += user;
                count++;
            }
        }

        if (count == 0) {
            return Optional.empty();
        }

        double averageScore = totalScore / count;
        return Optional.of(averageScore);
    }

    public Optional<String> findTopDeveloperByAverageScore(List<VideoGame> games) {
        if (games.isEmpty()) {
            return Optional.empty();
        }

        List<String> developers = new ArrayList<>();

        for (VideoGame game : games) {
            String developer = game.getDeveloper();
            if (!developers.contains(developer)) {
                developers.add(developer);
            }
        }

        Optional<String> bestDeveloper = Optional.empty();
        double bestAverage = Double.NEGATIVE_INFINITY;

        for (String developer : developers) {
            List<VideoGame> developerGames = new ArrayList<>();

            for (VideoGame game : games) {
                if (game.getDeveloper().equals(developer)) {
                    developerGames.add(game);
                }
            }

            Optional<Double> avgScoreOpt = calculateAverageScore(developerGames);
            if (avgScoreOpt.isPresent()) {
                double avgScore = avgScoreOpt.get();
                if (avgScore > bestAverage) {
                    bestAverage = avgScore;
                    bestDeveloper = Optional.of(developer);
                }
            }
        }
        return bestDeveloper;
    }
}