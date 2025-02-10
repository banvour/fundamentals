package io.everyonecodes.java.t3_testing.testing.exercise3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Max: ");
        int max = scanner.nextInt();

        if (max >= 9) {
            max = 9;
        } else if (max <= 1) {
            max = 1;
        }

        for (int i = 1; i <= max; i++) {
            for (int l = max - 1; l >= i; l--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
