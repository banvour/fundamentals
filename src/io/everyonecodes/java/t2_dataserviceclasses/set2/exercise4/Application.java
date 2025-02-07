package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise4;

public class Application {
    public static void main(String[] args) {
        AverageCalculator averageCalculator = new AverageCalculator();
        StepCollector stepCollector = new StepCollector();
        DistanceCalculator distanceCalculator = new DistanceCalculator();

        double averageStepAmount = (double) Math.round(averageCalculator.calculateAverage(stepCollector.collect()) * 100) / 100;
        double averageDistanceInKm = (double) Math.round(distanceCalculator.calculateDistanceInKilometers(averageStepAmount) * 100) / 100;

        System.out.println("average steps: " + averageStepAmount);
        System.out.println("average total distance: " + averageDistanceInKm + "km");
    }
}
