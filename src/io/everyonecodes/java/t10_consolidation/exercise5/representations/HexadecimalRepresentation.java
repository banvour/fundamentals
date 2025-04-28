package io.everyonecodes.java.t10_consolidation.exercise5.representations;

public class HexadecimalRepresentation implements Representation {
    @Override
    public String convert(char character) {
        return "0x" + Integer.toHexString(character).toUpperCase();
    }
}
