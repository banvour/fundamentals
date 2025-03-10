package io.everyonecodes.java.t6_evaluation1.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegersLeftShifter {

    public List<Integer> shiftOne(List<Integer> numbers) {
        List<Integer> rotatedList = new ArrayList<>(numbers);
        Collections.rotate(rotatedList, -1);
        return rotatedList;
    }
}
