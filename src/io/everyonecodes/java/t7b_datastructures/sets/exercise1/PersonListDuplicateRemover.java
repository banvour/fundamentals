package io.everyonecodes.java.t7b_datastructures.sets.exercise1;

import java.util.HashSet;
import java.util.List;

public class PersonListDuplicateRemover {
    public List<Person> remove(List<Person> people) {
        return new HashSet<>(people)
                .stream()
                .toList();
    }
}
