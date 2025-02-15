package io.everyonecodes.java.t4_methods.set1.exercise4;

import java.util.List;

public class FilmCharacterParser {

    public FilmCharacter parse(String input) {
        List<String> parts = List.of(input.split(";"));
        String firstName = parts.get(0);
        String lastName = parts.get(1);
        return new FilmCharacter(firstName, lastName);
    }
}
