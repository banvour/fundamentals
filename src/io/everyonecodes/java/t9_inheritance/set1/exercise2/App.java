package io.everyonecodes.java.t9_inheritance.set1.exercise2;

public class App {
    public static void main(String[] args) {
        Mansion mansion = new Mansion("M01", "Vienna", 2000000, 2023, true, 500.0);
        Skyscraper skyscraper = new Skyscraper("S01", "Dubai", 150000000, 2020, true, 40);

        Drill electricDrill = new Drill("steel", 3.5, new ElectricPower(200.0, 400.0));
        OilDrillingPlatform platform1 = new OilDrillingPlatform("P01", "Offshore A", 300000000, 2022, electricDrill);

        Drill diamondDrill = new Drill("diamond", 4.0, new GasPower(120.0));
        OilDrillingPlatform platform2 = new OilDrillingPlatform("P02", "Offshore B", 500000000, 2021, diamondDrill);
    }
}
