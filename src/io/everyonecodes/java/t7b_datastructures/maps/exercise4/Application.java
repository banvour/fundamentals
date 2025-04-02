package io.everyonecodes.java.t7b_datastructures.maps.exercise4;

public class Application {
    public static void main(String[] args) {
        CountryCityMapper countryCityMapper = new CountryCityMapper();
        countryCityMapper.printCities("Austria");
        System.out.println();

        countryCityMapper.addCityToCountry("Austria", "Vienna");
        countryCityMapper.addCityToCountry("Austria", "Graz");
        countryCityMapper.addCityToCountry("Austria", "Linz");
        countryCityMapper.addCityToCountry("Germany", "Munich");

        countryCityMapper.printCities("Austria");
        System.out.println();

        countryCityMapper.printCities("Germany");
        System.out.println();

        countryCityMapper.printCities("Switzerland");
    }
}
