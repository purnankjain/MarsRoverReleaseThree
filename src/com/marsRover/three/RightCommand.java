package com.marsRover.three;

public class RightCommand implements RoverCommands{

    Rover rover;

    public RightCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public String execute() {
        return rover.turnRight();
    }
}
