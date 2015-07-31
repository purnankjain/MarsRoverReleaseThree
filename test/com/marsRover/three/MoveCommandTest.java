package com.marsRover.three;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MoveCommandTest {

    @Test
    public void shouldCommandRoverToMove() {
        Rover mockRover = mock(Rover.class);
        MoveCommand moveCommand = new MoveCommand(mockRover);

        moveCommand.execute();

        verify(mockRover).move();
    }

}
