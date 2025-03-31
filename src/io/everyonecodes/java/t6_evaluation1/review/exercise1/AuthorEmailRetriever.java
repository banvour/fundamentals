package io.everyonecodes.java.t6_evaluation1.review.exercise1;

public class AuthorEmailRetriever {

    public String retrieve(Comment comment) {
        return comment.getAuthor().getEmail();
    }
}
