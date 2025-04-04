package io.everyonecodes.java.t7b_datastructures.mixed.exercise2;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        WeatherRecorder recorder = new WeatherRecorder();

        recorder.addRecord(LocalDate.of(2022, 9, 1), Weather.CLOUDY);
        recorder.addRecord(LocalDate.of(2022, 9, 2), Weather.RAINY);
        recorder.addRecord(LocalDate.of(2022, 9, 3), Weather.RAINY);
        recorder.addRecord(LocalDate.of(2022, 9, 4), Weather.SUNNY);
        recorder.addRecord(LocalDate.of(2022, 9, 5), Weather.STORMY);

        recorder.printWeatherReport();
    }
}
