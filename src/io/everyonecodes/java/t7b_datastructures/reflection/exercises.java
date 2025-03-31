package io.everyonecodes.java.t7b_datastructures.reflection;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class exercises {
    public static void main(String[] args) {
        Set<Integer> mutableSet = new HashSet<>();
        Set<Integer> immutableSet = Set.of(1,2,3);

        mutableSet.add(1);
        mutableSet.add(2);
        mutableSet.add(3);

        for (int num : immutableSet) {
            System.out.println(num);
        }

        var mutableSetIncreased = mutableSet
                .stream()
                .map(num -> num + 1)
                .collect(Collectors.toSet());

        System.out.println(mutableSetIncreased);
    }
}
