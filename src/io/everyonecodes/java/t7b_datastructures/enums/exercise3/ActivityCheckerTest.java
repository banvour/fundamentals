package io.everyonecodes.java.t7b_datastructures.enums.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ActivityCheckerTest {

    @ParameterizedTest
    @MethodSource("toDoOrNotToDo")
    public void testCheckActivityWeather(Weather weather, Activity activity, boolean expected) {
        ActivityChecker checker = new ActivityChecker();
        boolean result = checker.checkActivityWeather(weather, activity);
        Assertions.assertEquals(expected, result, "For " + activity + " in " + weather + ", expected " + expected);
    }

    static Stream<Arguments> toDoOrNotToDo() {
        return Stream.of(
                Arguments.of(Weather.SUNNY, Activity.VIDEO_GAMES, true),
                Arguments.of(Weather.RAINY, Activity.VIDEO_GAMES, true),

                Arguments.of(Weather.SUNNY, Activity.SOCCER, true),
                Arguments.of(Weather.CLOUDY, Activity.SOCCER, true),
                Arguments.of(Weather.RAINY, Activity.SOCCER, false),
                Arguments.of(Weather.SNOWY, Activity.SOCCER, false),
                Arguments.of(Weather.WINDY, Activity.SOCCER, false),

                Arguments.of(Weather.SNOWY, Activity.SKIING, true),
                Arguments.of(Weather.SUNNY, Activity.SKIING, false),

                Arguments.of(Weather.WINDY, Activity.SAILING, true),
                Arguments.of(Weather.CLOUDY, Activity.SAILING, false),

                Arguments.of(Weather.SUNNY, Activity.HIKING, true),
                Arguments.of(Weather.CLOUDY, Activity.HIKING, true),
                Arguments.of(Weather.RAINY, Activity.HIKING, false),
                Arguments.of(Weather.WINDY, Activity.HIKING, true),
                Arguments.of(Weather.SNOWY, Activity.HIKING, false)
        );
    }
}

