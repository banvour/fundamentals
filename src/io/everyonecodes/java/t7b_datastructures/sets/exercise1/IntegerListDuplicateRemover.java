package io.everyonecodes.java.t7b_datastructures.sets.exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerListDuplicateRemover {
    public List<Integer> remove(List<Integer> wholeNums) {
        Set<Integer> wholeNumsAsSet = new HashSet<>(wholeNums);
        return new ArrayList<>(wholeNumsAsSet);
    }
}
