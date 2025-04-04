package io.everyonecodes.java.t7b_datastructures.maps.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

public class UsersDataStoreTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void testGetUserByUsername(String inputUsername, User expectedUser) {
        UsersDataStore store = new UsersDataStore();
        Optional<User> actualUser = store.getUserByUsername(inputUsername);
        Assertions.assertEquals(Optional.of(expectedUser), actualUser);
    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("john", Optional.of(new User("john", "password123"))),
                Arguments.of("jane", Optional.of(new User("jane", "qwerty"))),
                Arguments.of("nonexistent", Optional.empty())
        );
    }
}
