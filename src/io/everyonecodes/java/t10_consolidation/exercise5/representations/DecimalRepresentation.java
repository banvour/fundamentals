package io.everyonecodes.java.t10_consolidation.exercise5.representations;

public class DecimalRepresentation implements Representation {
    @Override
    public String convert(char character) {
        return String.valueOf((int) character);
    }
}
