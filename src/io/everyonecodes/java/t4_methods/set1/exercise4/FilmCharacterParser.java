package io.everyonecodes.java.t4_methods.set1.exercise4;

public class FilmCharacterParser {

    public FilmCharacter parse(String input) {
        String[] parts = input.split(";");
        String firstName = parts[0];
        String lastName = parts[1];
        return new FilmCharacter(firstName, lastName);
    }
}
