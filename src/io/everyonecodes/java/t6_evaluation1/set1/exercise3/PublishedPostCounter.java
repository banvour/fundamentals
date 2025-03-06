package io.everyonecodes.java.t6_evaluation1.set1.exercise3;

public class PublishedPostCounter {

    public int count(Blog blog) {
        int count = 0;
        for (Post post : blog.getPosts()) {
            if (post.isPublished()) {
                count++;
            }
        }
        return count;
    }
}
