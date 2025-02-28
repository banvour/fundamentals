package io.everyonecodes.java.t5b_files.reflection.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LinesCalculator {

    private final IntegerListSumCalculator listSumCalculator = new IntegerListSumCalculator();
    private final StringToIntegersParser stringToIntegersParser = new StringToIntegersParser();

    public List<String> calculate(List<String> lines) {

        List<String> sums = new ArrayList<>();
        for (String line : lines) {
            List<Integer> numbers = stringToIntegersParser.parse(line);
            Optional<Integer> oSum = listSumCalculator.calculate(numbers);

            if (oSum.isPresent()) {
                sums.add(oSum.get().toString());
            } else {
                sums.add("");
            }
        }

        return sums;
    }
}
