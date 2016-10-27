package com.generic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PasswordMatcherTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void mainWithValidInput() throws Exception {
        PasswordMatcher.main(new String[]{"aB1_"});

        assertTrue(outContent.toString().contains("Password is: aB1_"));
    }

    @Test
    public void mainWithDefaultInput() throws Exception {
        PasswordMatcher.main(new String[]{});

        assertTrue(outContent.toString().contains("Password is: ABc12_"));
    }

    @Test
    public void mainWithInvalidInput() throws Exception {
        PasswordMatcher.main(new String[]{"***"});

        assertTrue(outContent.toString().isEmpty());
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(null);
    }
}