package io.everyonecodes.java.t6_evaluation1.set1.exercise4;

import io.everyonecodes.java.t6_evaluation1.set1.exercise3.Blog;
import io.everyonecodes.java.t6_evaluation1.set1.exercise3.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

class BlogCreationDateRetrieverTest {

    private final BlogCreationDateRetriever retriever = new BlogCreationDateRetriever();

    @ParameterizedTest
    @MethodSource("parameters")
    void retrieve(Website input, Date expected) {
        Date result = retriever.retrieve(input);
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
                        new Date(1, 1, 2000)
                ),
                Arguments.of(
                        new Website(
                                "another.com",
                                "Other content",
                                Optional.of(new Blog("Another Blog", new ArrayList<>(), new Date(31, 12, 2020)))
                        ),
                        new Date(31, 12, 2020)
                ),
                Arguments.of(
                        new Website(
                                "leapyear.com",
                                "Leap year blog",
                                Optional.of(new Blog("Leap Year Blog", new ArrayList<>(), new Date(29, 2, 2020)))
                        ),
                        new Date(29, 2, 2020),
                        Arguments.of(
                                new Website(
                                        "example.com",
                                        "Content here",
                                        Optional.empty()
                                ),
                                NoSuchElementException.class
                        )
                )
        );
    }
}
