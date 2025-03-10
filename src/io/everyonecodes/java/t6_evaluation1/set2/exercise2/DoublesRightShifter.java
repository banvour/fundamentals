package io.everyonecodes.java.t6_evaluation1.set2.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoublesRightShifter {

    public List<Double> shiftTwo(List<Double> numbers) {
        List<Double> rotatedList = new ArrayList<>(numbers);
        Collections.rotate(rotatedList, 2);
        return rotatedList;
    }
}
