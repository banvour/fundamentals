package io.everyonecodes.java.t7b_datastructures.sets.exercise4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCreator {

    public Set<Integer> getDistinctNumbers(List<Integer> list, List<Integer> list2) {
        Set<Integer> distinctNumbers = new HashSet<>();

        distinctNumbers.addAll(list);
        distinctNumbers.addAll(list2);

        return distinctNumbers;
    }

    public Set<Integer> getCommonNumbers(List<Integer> list, List<Integer> list2) {
        Set<Integer> distinctNumbers = new HashSet<>();

        distinctNumbers.addAll(list);
        distinctNumbers.retainAll(list2);

        return distinctNumbers;
    }
}
