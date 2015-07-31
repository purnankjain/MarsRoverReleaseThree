package com.marsRover.three;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    @Test
    public void shouldMoveForwardOnMove() {
        Rover rover = new Rover(0, 0, 0);

        assertEquals("0, 1, N", rover.move());
    }

}
