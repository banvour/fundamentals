package io.everyonecodes.java.t10_consolidation.exercise5.printers;

import io.everyonecodes.java.t10_consolidation.exercise5.representations.Representation;

import java.util.List;
import java.util.stream.Collectors;

public class AnnotatedStringPrinter implements StringPrinter{
    @Override
    public void print(List<String> strings, Representation representation) {
        strings.stream()
                .map(e -> e.chars()
                        .mapToObj(c -> {
                            char ogChar = (char) c;
                            return "'" + ogChar + "'(" + representation.convert((char) c) + ")";
                        })
                        .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }
}
