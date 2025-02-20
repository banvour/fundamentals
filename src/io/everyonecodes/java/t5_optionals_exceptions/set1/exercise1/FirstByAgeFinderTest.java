package io.everyonecodes.java.t5_optionals_exceptions.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FirstByAgeFinderTest {
    private final FirstByAgeFinder finder = new FirstByAgeFinder();

    @Test
    void find_EmptyList() {
        List<Person> persons = List.of();
        assertTrue(finder.find(persons, 30).isEmpty());
    }

    @Test
    void find_NoMatch() {
        List<Person> persons = List.of(new Person("Eve", 20), new Person("Frank", 35));
        assertTrue(finder.find(persons, 50).isEmpty());
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void find(List<Person> people, int inputAge, Person expected) {
        Optional<Person> result = finder.find(people, inputAge);
        Optional<Person> oExpected = Optional.of(expected);

        Assertions.assertEquals(oExpected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(List.of(new Person("Chuck", 30), new Person("Bob", 25), new Person("Charles", 30)), 30, new Person("Chuck", 30)),
                Arguments.of(List.of(new Person("Dub", 40)), 40, new Person("Dub", 40))
        );
    }
}
