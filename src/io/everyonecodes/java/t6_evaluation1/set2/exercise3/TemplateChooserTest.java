package io.everyonecodes.java.t6_evaluation1.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TemplateChooserTest {

    private final TemplateChooser chooser = new TemplateChooser();

    static Stream<Arguments> provideNamesAndTemplates() {
        return Stream.of(
                Arguments.of("Ms. Jane Doe", "female"),
                Arguments.of("Mrs. Ann Smith", "female"),
                Arguments.of("Mr. John Doe", "male"),
                Arguments.of("Mr. John Hokopoko", "privileged"),
                Arguments.of("Mrs. Jane Hokopoko", "privileged"),
                Arguments.of("Dr. Alice Brown", "default"),
                Arguments.of("", "default")
        );
    }

    @ParameterizedTest
    @MethodSource("provideNamesAndTemplates")
    void testChoose(String fullName, String expectedTemplate) {
        String actualTemplate = chooser.choose(fullName);
        Assertions.assertEquals(expectedTemplate, actualTemplate);
    }
}
