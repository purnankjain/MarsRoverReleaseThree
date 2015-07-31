package com.marsRover.three;

public class LeftCommand implements RoverCommands{

    Rover rover;

    public LeftCommand(Rover rover) {
        this.rover = rover;
    }

    public String execute() {
        return rover.turnLeft();
    }
}
