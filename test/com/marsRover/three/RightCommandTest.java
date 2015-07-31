package com.marsRover.three;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class RightCommandTest {

    @Test
    public void shouldCommandRoverToTurnRight() {
        Rover mockRover = mock(Rover.class);
        RightCommand rightCommand = new RightCommand(mockRover);

        rightCommand.execute();

        verify(mockRover).turnRight();
    }
}
