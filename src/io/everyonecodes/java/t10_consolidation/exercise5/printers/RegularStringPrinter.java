package io.everyonecodes.java.t10_consolidation.exercise5.printers;

import io.everyonecodes.java.t10_consolidation.exercise5.representations.Representation;

import java.util.List;
import java.util.stream.Collectors;

public class RegularStringPrinter implements StringPrinter {
    @Override
    public void print(List<String> strings, Representation representation) {
        strings.stream()
                .map(e -> e.chars()
                        .mapToObj(c -> representation.convert((char) c))
                        .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }
}