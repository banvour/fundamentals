package io.everyonecodes.java.t8_interfaces.set2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TableBuilderTest {

    @Test
    void buildCreatesTableWithCorrectParts() {
        TableBuilder tableBuilder = new TableBuilder();
        Furniture table = tableBuilder.build();
        assertEquals("table", table.getName());
        assertEquals(5, table.getParts().size());

        long legCount = table.getParts().stream().filter(part -> part.equals("leg")).count();
        long surfaceCount = table.getParts().stream().filter(part -> part.equals("surface")).count();
        assertEquals(4, legCount);
        assertEquals(1, surfaceCount);
    }
}
