package io.everyonecodes.java.t8_interfaces.set1.exercise4;

import java.util.List;
import java.util.Optional;

public class SuperheroCaller {

    private final List<Superhero> superheroes;

    public SuperheroCaller() {
        this.superheroes = List.of(
        new Superman(),
        new Batman(),
        new Spiderman());
    }

    public Optional<Superhero> findSuperhero(String keyword) {
        for (Superhero hero : superheroes) {
            if (hero.getSuperheroName().equalsIgnoreCase(keyword) || hero.getPrivateName().equalsIgnoreCase(keyword)) {
                return Optional.of(hero);
            }
        }
        return Optional.empty();
    }
}
