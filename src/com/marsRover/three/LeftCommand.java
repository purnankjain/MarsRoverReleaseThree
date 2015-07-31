package com.marsRover.three;

public class LeftCommand {

    Rover rover;

    public LeftCommand(Rover rover) {
        this.rover = rover;
    }

    public String execute() {
        rover.turnLeft();
        return null;
    }
}
