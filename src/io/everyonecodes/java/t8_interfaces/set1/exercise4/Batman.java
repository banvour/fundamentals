package io.everyonecodes.java.t8_interfaces.set1.exercise4;

public class Batman implements  Superhero {
    private final String privateName = "Bruce Wayne";
    private final String superheroName = "Batman";

    @Override
    public String getPrivateName() {
        return privateName;
    }

    @Override
    public String getSuperheroName() {
        return superheroName;
    }
}
