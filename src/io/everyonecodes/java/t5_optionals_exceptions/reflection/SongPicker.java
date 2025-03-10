package io.everyonecodes.java.t5_optionals_exceptions.reflection;

import java.util.List;
import java.util.Optional;

//Write a method that receives a list of songs, a minimum duration and a maximum duration, and a minimum rating. It should return the first song in the list that has a duration within the specified max/min, and a rating that is higher than the specified minimum.

public class SongPicker {

    public Optional<Song> pick(List<Song> playlist, int minDuration, int maxDuration, double minRating) {

        for (Song song : playlist) {
            double duration = song.getDurationInSec();
            if (duration >= minDuration && duration <= maxDuration &&
                    song.getRating() > minRating) {
                return Optional.of(song);
            }
        }

        return Optional.empty();
    }
}
