package io.everyonecodes.java.t6_evaluation1.reflection.exercise1;

public class Comment {
    private final String title;
    private final String content;
    private final User author;

    public Comment(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }
}
