package com.marsRover.three;

public class Rover {

    private int x;
    private int y;
    private int direction;
    private String sDirection;

    public Rover(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        setSDirection();
    }

    private void setSDirection() {
        switch (direction) {
            case 0 : sDirection = "N";
                break;
            case 1 : sDirection = "W";
                break;
            case 2 : sDirection = "S";
                break;
            case 3 : sDirection = "E";
                break;
        }
    }

    private String stateToString() {
        return String.format("%d, %d, %s", x, y, sDirection);
    }

    public String move() {
        switch (direction) {
            case 0 : y++;
                break;
            case 1 : x--;
                break;
            case 2 : y--;
                break;
            case 3 : x++;
                break;
        }
        return stateToString();
    }

    public String turnRight() {
        direction = (4 + direction - 1) % 4;
        setSDirection();
        return stateToString();
    }

    public String turnLeft() {
        direction = (direction + 1) % 4;
        setSDirection();
        return stateToString();
    }
}
