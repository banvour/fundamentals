package io.everyonecodes.java.t7_consolidation.reflection.exercise1;

public class Book {
    int ISBN;
    String title;
    String authorLastName;
    String authorFirstName;
    int pageAmount;
    boolean isBorrowed;

    public Book(int ISBN, String title, String authorLastName, String authorFirstName, int pageAmount, boolean isBorrowed) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorLastName = authorLastName;
        this.authorFirstName = authorFirstName;
        this.pageAmount = pageAmount;
        this.isBorrowed = isBorrowed;
    }
}
