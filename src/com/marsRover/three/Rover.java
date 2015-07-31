package com.marsRover.three;

public class Rover {

    private int x;
    private int y;
    private int direction;

    public Rover(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    private String stateToString() {
        return String.format("%d, %d, %s", x, y, "N");
    }

    public String move() {
        y++;
        return stateToString();
    }
}
