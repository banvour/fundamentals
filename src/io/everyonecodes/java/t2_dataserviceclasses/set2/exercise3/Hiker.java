package io.everyonecodes.java.t2_dataserviceclasses.set2.exercise3;

public class Hiker {
    private String name;
    private int telNum;

    public Hiker(String name, int telNum) {
        this.name = name;
        this.telNum = telNum;
    }

    public String getName() {
        return name;
    }

    public int getTelNum() {
        return telNum;
    }

    @Override
    public String toString() {
        return "Hiker{" +
                "name='" + name + '\'' +
                ", telNum=" + telNum +
                '}';
    }
}
