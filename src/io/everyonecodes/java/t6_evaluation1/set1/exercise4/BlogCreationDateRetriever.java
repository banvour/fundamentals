package io.everyonecodes.java.t6_evaluation1.set1.exercise4;

import io.everyonecodes.java.t6_evaluation1.set1.exercise3.Date;

public class BlogCreationDateRetriever {

    public Date retrieve(Website website) {
        return website.getBlog()
                .orElseThrow()
                .getDateCreated();
    }
}
