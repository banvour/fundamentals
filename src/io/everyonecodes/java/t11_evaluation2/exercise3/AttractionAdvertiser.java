package io.everyonecodes.java.t11_evaluation2.exercise3;

import java.util.List;

public class AttractionAdvertiser {
    public String advertise(List<Attraction> listOfAttractions) {
    for (Attraction attraction : listOfAttractions) {
        System.out.println(attraction.createAdvertisement());
    }
        return null;
    }
}
