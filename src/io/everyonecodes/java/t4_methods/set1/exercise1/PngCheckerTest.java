package io.everyonecodes.java.t4_methods.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PngCheckerTest {

    PngChecker pngChecker = new PngChecker();

    @ParameterizedTest
        @CsvSource({
                "true, somefile.png",
                "true, anotherfile.pNg",
                "true, file.PNG",
                "false, file.jpeg",
                "false, ''",
                "false, filename",
                "true, ' file.png '"
        })

    void testCheck(boolean expected, String input) {
        boolean result = pngChecker.check(input);

        Assertions.assertEquals(expected, result);
    }

}
