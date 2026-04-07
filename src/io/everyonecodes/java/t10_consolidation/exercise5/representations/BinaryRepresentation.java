package io.everyonecodes.java.t10_consolidation.exercise5.representations;

public class BinaryRepresentation implements Representation {
    @Override
    public String convert(char character) {
        return "0b" + Integer.toBinaryString(character);
    }
}