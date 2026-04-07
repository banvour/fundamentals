package io.everyonecodes.java.t10_consolidation.exercise5;

import io.everyonecodes.java.t10_consolidation.exercise5.printers.AnnotatedStringPrinter;
import io.everyonecodes.java.t10_consolidation.exercise5.printers.RegularStringPrinter;
import io.everyonecodes.java.t10_consolidation.exercise5.printers.StringPrinter;
import io.everyonecodes.java.t10_consolidation.exercise5.representations.BinaryRepresentation;
import io.everyonecodes.java.t10_consolidation.exercise5.representations.DecimalRepresentation;
import io.everyonecodes.java.t10_consolidation.exercise5.representations.HexadecimalRepresentation;
import io.everyonecodes.java.t10_consolidation.exercise5.representations.Representation;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> content = List.of("A", "AB", "12  45", "a word");

        List<StringPrinter> printers = List.of(
                new RegularStringPrinter(),
                new AnnotatedStringPrinter()
        );

        List<Representation> representations = List.of(
                new BinaryRepresentation(),
                new DecimalRepresentation(),
                new HexadecimalRepresentation()
        );

        representations.forEach(representation ->
                printers.forEach(printer -> {
                    printer.print(content, representation);
                    System.out.println();
                })
        );
    }
}
