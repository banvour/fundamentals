package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HikerGatherer {
    public List<Hiker> gather() {
        Scanner scanner = new Scanner(System.in);
        List<Hiker> hikers = new ArrayList<>();

        while (true) {
            System.out.println("enter name pls: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("enter phone number pls: ");
            int num = scanner.nextInt();
            scanner.nextLine();

            Hiker hiker = new Hiker(name, num);
            hikers.add(hiker);
        }

        return hikers;
    }
}
