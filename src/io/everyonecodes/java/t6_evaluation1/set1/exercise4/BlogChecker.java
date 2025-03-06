package io.everyonecodes.java.t6_evaluation1.set1.exercise4;

public class BlogChecker {

    public boolean hasBlog(Website website) {
        return website.getBlog().isPresent();
    }
}
