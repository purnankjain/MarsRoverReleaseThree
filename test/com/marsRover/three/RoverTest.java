package com.marsRover.three;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void shouldMoveForwardOnMoveUpWhenNorth() {
        Rover rover = new Rover(0, 0, 0);

        assertEquals("0, 1, N", rover.move());
    }

    @Test
    public void shouldMoveForwardOnMoveDownWhenSouth() {
        Rover rover = new Rover(0, 1, 2);

        assertEquals("0, 0, N", rover.move());
    }
}