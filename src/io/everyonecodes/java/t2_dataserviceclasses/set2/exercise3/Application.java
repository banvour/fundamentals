package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        HikerGatherer gatherer = new HikerGatherer();
        List<Hiker> hikers = gatherer.gather();

        Hike hike = new Hike("02.03.1998", hikers);

        HikeDisplayer displayer = new HikeDisplayer();

        displayer.display(hike);
    }
}
