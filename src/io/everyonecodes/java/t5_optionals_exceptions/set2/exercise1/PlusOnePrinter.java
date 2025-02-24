package io.everyonecodes.java.t5_optionals_exceptions.set2.exercise1;

import java.util.Scanner;

public class PlusOnePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("type an integer or 'stop': ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                System.out.println("incremented: " + (num + 1));
            }
            catch (NumberFormatException e) {
                System.out.println("error!!!11!1 enter valid number pls");
            }
        }
    }
}
