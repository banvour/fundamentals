package io.everyonecodes.java.t7b_datastructures.sets.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonListDuplicateRemoverTest {

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testRemoveDuplicates(List<Person> input, List<Person> expected) {
        PersonListDuplicateRemover remover = new PersonListDuplicateRemover();
        List<Person> result = remover.remove(input);

        Set<Person> expectedSet = new HashSet<>(expected);
        Set<Person> resultSet = new HashSet<>(result);

        assertEquals(expectedSet, resultSet);
    }

    private static Stream<Arguments> provideTestCases() {
        Person alice = new Person("Alice", 30);
        Person bob = new Person("Bob", 25);
        Person charlie = new Person("Charlie", 40);
        Person dave = new Person("Dave", 35);
        Person eve = new Person("Eve", 28);

        return Stream.of(
                Arguments.of(
                        List.of(alice, bob, alice),
                        List.of(alice, bob)
                ),
                Arguments.of(
                        List.of(charlie, dave),
                        List.of(charlie, dave)
                ),
                Arguments.of(
                        List.of(),
                        List.of()
                ),
                Arguments.of(
                        List.of(eve, eve, eve),
                        List.of(eve)
                )
        );
    }
}
