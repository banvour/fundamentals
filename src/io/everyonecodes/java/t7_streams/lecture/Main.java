package io.everyonecodes.java.t7_streams.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.logging.Filter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {}}

//        List<String> upperCaseList = Stream.of("apple", "banana", "cherry")
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());

//        List<String> upperCaseList = new ArrayList<>();
//
//        var upperCaseList2 = Stream.of("apple", "banana", "cherry")
//                .map(e -> {
//                    upperCaseList2.add(e);
//                    upperCaseList2.add("placeholder");
//                    System.out.println(e);
//                    return e;
//                })
//                .toList();
//
//        System.out.println(upperCaseList2);
//        System.out.println(upperCaseList);
//
//    }}
//        // Define a lambda that takes no parameters and returns nothing (void).
////        runnable has no input returns void!!!!!!!!!!!
//        Runnable printLambda = () -> {
//            System.out.println("Hello, world!");
//        };
//        // Call the lambda by invoking its run method.
//        printLambda.run();
//
////        OR ?
//        Function<String, String> myToUpperCaseInVar = Main::myToUpperCase;
//        String upperCased = myToUpperCaseInVar.apply("example");
//        System.out.println(upperCased);
//
//        Function<String, String> myToUpperCaseAsLambda = (String input) -> {
//            return input.toUpperCase();
//        };
//
//
//        Function<Double, Integer> getDoubleGiveInteger = ( input) -> {
//            double roundedInput = Math.floor(input);
//            return Integer.valueOf(input);
//        };
//
//
//        Function<String, Boolean> StringToBooblean = (element) -> {
//            return (element.startsWith("B"));
//        };
//
//        System.out.println((List.of("l", "B"), StringToBooblean));
//
//
//
//    }
//
//    private static String myToUpperCase(String s) {
//        return s.toUpperCase();
//    }
//
//
//    public static List<String> filterElementsThatStartWith(List<String> inputList, Function<String, Boolean> StringToBooblean) {
//        List<String> result = new ArrayList<>();
//        for (String element : inputList) {
//            StringToBooblean.apply(element);
//        }
//        result.stream().filter()
//        return;
//    }
//
//}
