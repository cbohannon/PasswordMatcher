package com.generic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordMatcherTest {
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void mainWithValidInput() {
        PasswordMatcher.main(new String[]{"aB1_"});

        assertTrue(outContent.toString().contains("Password is: aB1_"));
    }

    @Test
    void mainWithDefaultInput() {
        PasswordMatcher.main(new String[]{});

        assertTrue(outContent.toString().contains("Password is: ABc12_"));
    }

    @Test
    void mainWithInvalidInput() {
        PasswordMatcher.main(new String[]{"***"});

        assertTrue(outContent.toString().contains("Unsupported characters in password"));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
