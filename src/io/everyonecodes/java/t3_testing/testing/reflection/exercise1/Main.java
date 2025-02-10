package io.everyonecodes.java.t7_consolidation.reflection.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(234324, "myes", "book", "page", 200, false);
        Book book2 = new Book(333333, "mno", "writer", "dick", 400, true);

        Magazine magazine1 = new Magazine("good one", 34234, true);
        Magazine magazine2 = new Magazine("bad one", 66666, false);

        Branch library1 = new Branch(2005, "street of streets",
                new ArrayList<>(List.of(book1, book2)),
                new ArrayList<>(List.of(magazine1, magazine2))
        );
        List<Book> sortedBooks = checkBoobs(library1);

        for (Book book : sortedBooks) {
            System.out.println(book.title);
        }
    }

    public static List<Book> checkBoobs(Branch library) {
        List<Book> newBookList = new ArrayList<>(List.of());

        for (Book book : library.books) {
            if (!book.isBorrowed && book.pageAmount <= 200) {
                newBookList.add(book);
            }
        }

        return newBookList;
    }
}
