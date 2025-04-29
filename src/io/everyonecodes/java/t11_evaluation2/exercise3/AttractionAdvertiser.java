package io.everyonecodes.java.t11_evaluation2.exercise3;

import java.util.List;

public class AttractionAdvertiser {
    public void advertise(List<Attraction> listOfAttractions) {
    for (Attraction attraction : listOfAttractions) {
        System.out.println(attraction.createAdvertisement());
    }
}
}
