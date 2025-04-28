package io.everyonecodes.java.t10_consolidation.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class CreditCardCheckerTest {
    private final CreditCardChecker creditCardChecker = new CreditCardChecker();

    @ParameterizedTest
    @MethodSource("parameters")
    void evaluate(String input, String expected) {
        String result = creditCardChecker.evaluate(input);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("4539578763621486", "VISA"),
                Arguments.of("5500000000000004", "MASTERCARD"),
                Arguments.of("378282246310005", "AMERICAN EXPRESS"),
                Arguments.of("6011000990139424", "NOT SUPPORTED"),
                Arguments.of("1234567812345678", "INVALID"),
                Arguments.of("9999999999999999", "INVALID"),
                Arguments.of("", "INVALID"),
                Arguments.of("abcd1234", "INVALID")
        );
    }
}