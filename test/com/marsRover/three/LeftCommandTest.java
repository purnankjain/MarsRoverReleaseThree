package com.marsRover.three;

import org.junit.Test;

import static org.mockito.Mockito.*;


public class LeftCommandTest {

    @Test
    public void shouldCommandRoverToTurnLeft() {
        Rover mockRover = mock(Rover.class);
        LeftCommand leftCommand = new LeftCommand(mockRover);

        leftCommand.execute();

        verify(mockRover).turnLeft();
    }
}
