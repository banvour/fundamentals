package io.everyonecodes.java.t8_interfaces.set2.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operation:");
        String input = scanner.nextLine();
        List<String> parts = List.of(input.split(" "));

        if (parts.size() != 3) {
            System.out.println("invalid input format, i need it like this <number1> <operator> <number2>");
            scanner.close();
            return;
        }

        try {
            double num1 = Double.parseDouble(parts.get(0));
            double num2 = Double.parseDouble(parts.get(2));
            char symbol = parts.get(1).charAt(0);

            Calculation calculation = new Calculation(symbol, num1, num2);
            Calculator calculator = new Calculator();
            Optional<Double> result = calculator.calculate(calculation);

            if (result.isPresent()) {
                System.out.println("Solution: " + result.get());
            } else {
                System.out.println("Solution: operation " + symbol + " is not available");
            }
        } catch (NumberFormatException e) {
            System.out.println("numbers or operator is wrong");;
        }
    }
}
