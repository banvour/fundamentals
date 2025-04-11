package io.everyonecodes.java.t8_interfaces.set1.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroCallerTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void testFindSuperhero(String input, Superhero expectedSuperhero) {
        SuperheroCaller caller = new SuperheroCaller();
        Optional<Superhero> hero = caller.findSuperhero(input);

        assertTrue(hero.isPresent());
        assertEquals(hero.get().getSuperheroName(), expectedSuperhero.getSuperheroName());
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Bruce Wayne", new Batman()),
                Arguments.of("Batman", new Batman()),
                Arguments.of("Clark", new Superman()),
                Arguments.of("Superman", new Superman()),
                Arguments.of("Peter", new Spiderman()),
                Arguments.of("Spiderman", new Spiderman())
        );
    }
}
