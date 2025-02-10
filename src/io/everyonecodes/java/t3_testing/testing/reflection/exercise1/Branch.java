package io.everyonecodes.java.t7_consolidation.reflection.exercise1;

import java.util.List;

public class Branch {
    int yearOfOpening;
    String streetName;
    List<Book> books;
    List<Magazine> magazines;

    public Branch(int yearOfOpening, String streetName, List<Book> books, List<Magazine> magazines) {
        this.yearOfOpening = yearOfOpening;
        this.streetName = streetName;
        this.books = books;
        this.magazines = magazines;
    }
}
