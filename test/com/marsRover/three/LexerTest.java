package com.marsRover.three;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LexerTest {

    @Test
    public void shouldLexCommandInputToStringArray() {
        Lexer lexer = new Lexer();
        ArrayList<String> commands = new ArrayList<String>();
        commands.add("L");
        commands.add("M");
        commands.add("M");

        assertEquals(commands, lexer.lexCommands("LMM"));
    }

    @Test
    public void shouldLexNewRoverStates() {
        Lexer lexer = new Lexer();
        ArrayList<String> states = new ArrayList<String>();
        states.add("0");
        states.add("0");
        states.add("N");

        assertEquals(states, lexer.lexStates("0 0 N"));
    }
}
