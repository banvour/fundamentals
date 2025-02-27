package io.everyonecodes.java.t5b_files.set1.exercise2;

public class Character {
    private String name;
    private int bookOfDeath;
    private String gender;

    public Character(String name, int bookOfDeath, String gender) {
        this.name = name;
        this.bookOfDeath = bookOfDeath;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getBookOfDeath() {
        return bookOfDeath;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "GotCharacter{name='" + name + "', bookOfDeath=" + bookOfDeath + ", gender='" + gender + "'}";
    }
}