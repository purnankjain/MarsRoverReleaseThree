package com.marsRover.three;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ParserTest {

    @Test
    public void shouldParseStringToCommands() {
        Rover rover = null;
        LeftCommand mockLeftCommand = mock(LeftCommand.class);
        RightCommand mockRightCommand = mock(RightCommand.class);
        MoveCommand mockMoveCommand = mock(MoveCommand.class);
        Lexer mockLexer = mock(Lexer.class);
        Parser parser = new Parser(mockLexer);
        ArrayList<String> lexedCommands = new ArrayList<>();
        lexedCommands.add("L");
        
        when(mockLexer.lexCommands("L")).thenReturn(lexedCommands);
        when(mockLeftCommand.hasName("L")).thenReturn(true);

        assertEquals(LeftCommand.class, parser.parseCommands("L").get(0).getClass());
    }
}
