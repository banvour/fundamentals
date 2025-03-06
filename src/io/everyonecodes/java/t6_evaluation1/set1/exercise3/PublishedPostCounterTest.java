package io.everyonecodes.java.t6_evaluation1.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class PublishedPostCounterTest {

    private final PublishedPostCounter counter = new PublishedPostCounter();

    @ParameterizedTest
    @MethodSource("parameters")
    void create(Blog input, int expected) {
        int result = counter.count(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        Blog emptyBlog = new Blog("Empty Blog", new ArrayList<>(), new Date(1, 1, 2020));

        List<Post> allPublishedPosts = new ArrayList<>();
        allPublishedPosts.add(new Post("Post 1", "Content 1", new Date(1, 1, 2020), true));
        allPublishedPosts.add(new Post("Post 2", "Content 2", new Date(2, 1, 2020), true));
        Blog allPublishedBlog = new Blog("All Published", allPublishedPosts, new Date(1, 1, 2020));

        List<Post> noPublishedPosts = new ArrayList<>();
        noPublishedPosts.add(new Post("Post 1", "Content 1", new Date(1, 1, 2020), false));
        noPublishedPosts.add(new Post("Post 2", "Content 2", new Date(2, 1, 2020), false));
        Blog noPublishedBlog = new Blog("None Published", noPublishedPosts, new Date(1, 1, 2020));

        List<Post> singlePublishedPost = new ArrayList<>();
        singlePublishedPost.add(new Post("Single Post", "Content", new Date(1, 1, 2020), true));
        Blog singlePostBlog = new Blog("Single Post Blog", singlePublishedPost, new Date(1, 1, 2020));

        return Stream.of(
                Arguments.of(emptyBlog, 0),
                Arguments.of(allPublishedBlog, 2),
                Arguments.of(noPublishedBlog, 0),
                Arguments.of(singlePostBlog, 1)
        );
    }
}
