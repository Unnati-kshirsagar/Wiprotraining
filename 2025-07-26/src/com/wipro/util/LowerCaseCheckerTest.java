package com.wipro.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.NullSource;

public class LowerCaseCheckerTest {

    LowerCaseChecker checker = new LowerCaseChecker();

    @ParameterizedTest
    @ValueSource(strings = { "hello", "java", "world" })
    void testAllLowerCase(String input) {
        assertTrue(checker.isAllLowerCase(input));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Hello", "Java", "TestCase", "WORLD" })
    void testNotAllLowerCase(String input) {
        assertFalse(checker.isAllLowerCase(input));
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = { "", "123", "   ", "!@#", "hello123" })
    void testInvalidInputs(String input) {
        assertFalse(checker.isAllLowerCase(input));
    }
}
