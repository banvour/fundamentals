package io.everyonecodes.java.t6_evaluation1.review.exercise1;

public class Application {
    public static void main(String[] args) {
        AuthorEmailRetriever retriever = new AuthorEmailRetriever();

        Comment comment = new Comment("title", "content", new User("mail adress here", "pw"));

        System.out.println(retriever.retrieve(comment));
    }
}
