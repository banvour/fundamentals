package io.everyonecodes.java.t7b_datastructures.enums.exercise1;

import java.util.*;

public class ShopAssistant {

    private final List<TShirt> tshirts = new ArrayList<>(List.of(
            new TShirt("blue", TShirtSize.M, 10.0),
            new TShirt("orange", TShirtSize.M, 2.0),
            new TShirt("yellow", TShirtSize.XS, 500.0)));

    private Optional<TShirtSize> askForSize() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to everyone shops!\n" +
                "What size do you have?");
        String input = scanner.nextLine();

//        try {
//            TShirtSize size = TShirtSize.valueOf(input.toUpperCase());
//            return Optional.of(size);
//        } catch (IllegalArgumentException e) {
//            return Optional.empty();
//        }

        return Arrays.stream(TShirtSize.values())
                .filter(size -> size.name().equalsIgnoreCase(input))
                .findFirst();
    }

    private List<TShirt> findShirtsThatFit(TShirtSize size) {
        List<TShirt> shirtsThatFit = new ArrayList<>();

        for (TShirt shirt : tshirts) {
            if (shirt.getSize().equals(size)) {
                shirtsThatFit.add(shirt);
            }
        }
        return shirtsThatFit;
    }

    public void dealWithCustomer() {
        Optional<TShirtSize> oSize = askForSize();

        if (oSize.isEmpty()) {
            System.out.println("Sorry, we don't have that size on offer!");
            return;
        }

        TShirtSize size = oSize.get();
        List<TShirt> availableShirts = findShirtsThatFit(size);
        if (availableShirts.isEmpty()) {
            System.out.println("I'm sorry, we have no shirts available for your size.");
        } else {
            for (TShirt shirt : availableShirts) {
                System.out.println("We have a " + shirt.getColor() + " shirt for " + shirt.getPrice() + " euro.");
            }
        }
    }
}
