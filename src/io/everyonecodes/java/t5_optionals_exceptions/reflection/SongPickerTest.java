package io.everyonecodes.java.t5_optionals_exceptions.reflection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

class SongPickerTest {

    private final SongPicker picker = new SongPicker();

    @ParameterizedTest
    @MethodSource("parameters")
    void pick(double maxDuration, double minDuration, double minRating, String expectedTitle) {
//        Optional<Song> result = pick();
//        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(

                ),
                Arguments.of(

                )
        );
    }
}