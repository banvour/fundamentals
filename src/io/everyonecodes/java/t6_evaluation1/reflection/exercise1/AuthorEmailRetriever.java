package io.everyonecodes.java.t6_evaluation1.reflection.exercise1;

public class AuthorEmailRetriever {

    public String retrieve(Comment comment) {
        return comment.getAuthor().getEmail();
    }
}
