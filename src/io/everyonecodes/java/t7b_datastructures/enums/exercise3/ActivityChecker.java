package io.everyonecodes.java.t7b_datastructures.enums.exercise3;

public class ActivityChecker {

    public boolean checkActivityWeather(Weather weather, Activity activity) {
        switch (activity) {
            case VIDEO_GAMES:
                return true;

            case SOCCER:
                return (weather == Weather.SUNNY || weather == Weather.CLOUDY);

            case SKIING:
                return (weather == Weather.SNOWY);

            case SAILING:
                return (weather == Weather.WINDY);

            case HIKING:
                return (weather == Weather.SUNNY || weather == Weather.CLOUDY || weather == Weather.WINDY);

            default:
                return false;
        }
    }
}
