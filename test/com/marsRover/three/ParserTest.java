package com.marsRover.three;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ParserTest {

    @Test
    public void shouldParseStringToCommands() {
        Lexer mockLexer = mock(Lexer.class);
        Parser parser = new Parser(mockLexer);
        ArrayList<String> lexedCommands = new ArrayList<>();
        lexedCommands.add("L");

        when(mockLexer.lexCommands("L")).thenReturn(lexedCommands);

        assertEquals(LeftCommand.class, parser.parseCommands("L").get(0).getClass());
    }

    @Test
    public void shouldParseARoverWithStates() {
        Lexer mockLexer = mock(Lexer.class);
        Parser parser = new Parser(mockLexer);
        ArrayList<String> lexedStates = new ArrayList<>();
        lexedStates.add("0");
        lexedStates.add("0");
        lexedStates.add("N");

        when(mockLexer.lexStates("0 0 N")).thenReturn(lexedStates);

        assertEquals(Rover.class, parser.parseRover("0 0 N").getClass());
    }
}
