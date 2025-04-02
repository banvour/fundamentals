package io.everyonecodes.java.t7b_datastructures.maps.exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryCityMapper {

    private final Map<String, List<String>> countryEntry = new HashMap<>();

    public void addCityToCountry(String country, String city) {
        countryEntry.computeIfAbsent(country, k -> new ArrayList<>()).add(city);
    }

    public void printCities(String country) {
        List<String> cities = countryEntry.get(country);

        if (cities == null || cities.isEmpty()) {
            System.out.println("It seems that " + country + " doesn't have any cities.");
        } else {
            System.out.println(country + " has the following cities:");
            for (String city : cities) {
                System.out.println(city);
            }
        }

//        try {
//        System.out.println(country + " has the following cities:");
//            for (String city : cities) {
//                System.out.println(city);
//            }
//        } catch (NullPointerException e) {
//            System.out.println("It seems that " + country + " doesn't have any cities.");;
//        }
    }
}
