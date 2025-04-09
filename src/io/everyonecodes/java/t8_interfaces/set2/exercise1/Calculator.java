package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import java.util.List;
import java.util.Optional;

public class Calculator {
    private final List<Operator> operators;

    public Calculator() {
        this.operators = Operators.getOperators();
    }

    public Optional<Double> calculate(Calculation calculation) {
        for (Operator operator : operators) {
            if (operator.getSymbol()== calculation.getSymbol()) {
                double a = calculation.getNumber1();
                double b = calculation.getNumber2();

                return Optional.of(operator.operate(a, b));
            }
        }

        return Optional.empty();
    }
}
