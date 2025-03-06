package io.everyonecodes.java.t6_evaluation1.set1.exercise4;

import io.everyonecodes.java.t6_evaluation1.set1.exercise3.Blog;
import io.everyonecodes.java.t6_evaluation1.set1.exercise3.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

class BlogCheckerTest {

    private final BlogChecker checker = new BlogChecker();

    @ParameterizedTest
    @MethodSource("parameters")
    void hasBlog(Website input, boolean expected) {
        boolean result = checker.hasBlog(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        new Website(
                                "example.com",
                                "Sample content",
                                Optional.of(new Blog("My Blog", new ArrayList<>(), new Date(1, 1, 2000)))
                        ),
                        true
                ),
                Arguments.of(
                        new Website(
                                "example.com",
                                "Sample content",
                                Optional.empty()
                        ),
                        false
                ),
                Arguments.of(
                        new Website(
                                "",
                                "",
                                Optional.of(new Blog("", new ArrayList<>(), new Date(15, 5, 2010)))
                        ),
                        true
                )
        );
    }
}
