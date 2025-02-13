package io.everyonecodes.java.t4_methods.set1.exercise4;

import java.util.Objects;

public class FilmCharacter {
    private String firstName;
    private String lastName;

    public FilmCharacter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        FilmCharacter character = (FilmCharacter) o;
        return Objects.equals(firstName, character.firstName) && Objects.equals(lastName, character.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
