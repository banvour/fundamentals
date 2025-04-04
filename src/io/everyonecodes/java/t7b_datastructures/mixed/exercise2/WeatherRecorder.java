package io.everyonecodes.java.t7b_datastructures.mixed.exercise2;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;


public class WeatherRecorder {
    private final Map<LocalDate, Weather> weatherEntries = new TreeMap<>();

    public void addRecord(LocalDate date, Weather weather) {
        weatherEntries.put(date, weather);
    }

    public void printWeatherReport() {
        for (Map.Entry<LocalDate, Weather> entry : weatherEntries.entrySet()) {
            LocalDate date = entry.getKey();
            Weather weather = entry.getValue();
            System.out.println(date + ": The weather is " + weather.getDescription() + ".");
        }
    }
}
