package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {

    public List<Integer> collect() {
        Scanner scanner = new Scanner(System.in);

        List<String> people = new ArrayList<>(List.of("Matilda", "Hansel", "Derek"));
        List<Integer> stepAmount = new ArrayList<>();

        for (String person : people) {
            System.out.println(person + " pls enter how many steps");
            int amountOfSteps = scanner.nextInt();
            stepAmount.add(amountOfSteps);
        }

        return stepAmount;
    }
}
