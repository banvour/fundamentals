package io.everyonecodes.java.t5b_files.set1.exercise2;

import java.util.Optional;

public class GotDataParser {

    public static Optional<Character> parseLine(String line) {
        if (line.isEmpty() || line.trim().isEmpty()) {
            return Optional.empty();
        }
        String[] parts = line.split(";");
        if (parts.length < 7) {
            return Optional.empty();
        }
        String name = parts[0];

        int bookOfDeath;
        try {
            bookOfDeath = Integer.parseInt(parts[3]);
        } catch (NumberFormatException e) {
            bookOfDeath = 0;
        }

        String gender = "";
        if (parts[6].equals("1")) {
            gender = "male";
        } else if (parts[6].equals("0")) {
            gender = "female";
        }
        return Optional.of(new Character(name, bookOfDeath, gender));
    }
}
