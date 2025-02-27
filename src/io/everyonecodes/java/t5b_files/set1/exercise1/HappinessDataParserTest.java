package io.everyonecodes.java.t5b_files.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HappinessDataParserTest {

    private final HappinessDataParser parser = new HappinessDataParser();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Lesotho;139;3.80800008773804;4.04434397548437;3.5716561999917;0.521021246910095;1.19009518623352;0;0.390661299228668;0.157497271895409;0.119094640016556;1.42983531951904", Optional.of(new HappinessRecord("Lesotho", 139, 3.80800008773804))),
                Arguments.of("", Optional.empty()));
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void parse(String input, Optional<HappinessRecord> oExpected) {
        Optional<HappinessRecord> oResult = parser.parseLine(input);
        assertEquals(oExpected, oResult);
    }
}