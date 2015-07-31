package com.marsRover.three;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class ViewTest {

    ByteArrayInputStream byteArrayInputStream;
    ByteArrayOutputStream byteArrayOutputStream;
    PrintStream printStreamOriginal;
    InputStream inputStreamOriginal;
    View view;
    String toCheck;

    @Before
    public void initialise() {
        toCheck = "Hello";
        inputStreamOriginal = System.in;
        printStreamOriginal = System.out;
        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayInputStream = new ByteArrayInputStream(toCheck.getBytes());
        System.setOut(new PrintStream(byteArrayOutputStream));
        view = new View(new BufferedReader(new InputStreamReader(byteArrayInputStream)));
    }

    @After
    public void cleanUp() {
        System.setIn(inputStreamOriginal);
        System.setOut(printStreamOriginal);
    }

    @Test
    public void checkInput() {
        assertEquals(toCheck, view.readUserInput());
    }

}
