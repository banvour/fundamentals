package io.everyonecodes.java.t5_optionals_exceptions.reflection;

import java.util.*;

//Write a method that reads in and returns a list of songs from the keyboard. Make sure that this does not crash, no matter what the user enters. Instead, if the user enters an invalid value, prompt them to try again. Use the interaction below as an example.

public class PlaylistMaker {

    public List<Song> makePlaylist() {
        Scanner scanner = new Scanner(System.in);
        List<Song> playlist = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a song title.");
            String title = scanner.nextLine();

            double durationInSec;
            while (true) {
                System.out.println("Please enter the song's duration in seconds.");
                String durationInSec_Input = scanner.nextLine();
                try {
                    durationInSec = Double.parseDouble(durationInSec_Input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("This is not a valid duration. Please try again.");
                }
            }

            double rating;
            while (true) {
                System.out.println("Please enter the song's rating, which should be between 1 and 5 stars. Decimal numbers are allowed.");
                String rating_Input = scanner.nextLine();
                try {
                    rating = Double.parseDouble(rating_Input);
                    if (rating <= 5 && rating >= 1) {
                        break;
                    } else {
                        System.out.println("This is not a valid rating. Please try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("This is not a valid rating. Please try again.");
                }
            }

            Song song = new Song(title, durationInSec, rating);
            playlist.add(song);

            while (true) {
                System.out.println("Add another song?");
                String shouldAddMore = scanner.nextLine();

                if (shouldAddMore.equals("true")) {
                    break;
                } else if (shouldAddMore.equals("false")) {
                    return playlist;
                } else {
                    System.out.println("Please enter 'true' or 'false'.");
                }
            }
        }
    }
}