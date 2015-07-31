package com.marsRover.three;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LexerTest {

    @Test
    public void shouldLexInputToVariousStrings() {
        Lexer lexer = new Lexer();
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("L");
        commands.add("M");
        commands.add("M");

        assertEquals(commands, lexer.lexCommands("LMM"));
    }
}
