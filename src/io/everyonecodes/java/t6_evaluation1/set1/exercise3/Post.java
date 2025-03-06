package io.everyonecodes.java.t6_evaluation1.set1.exercise3;

public class Post {
    private final String title;
    private final String content;
    private final Date dateCreated;
    private final boolean isPublished;

    public Post(String title, String content, Date dateCreated, boolean isPublished) {
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
        this.isPublished = isPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isPublished() {
        return isPublished;
    }
}
