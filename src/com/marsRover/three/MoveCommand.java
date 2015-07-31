package com.marsRover.three;

public class MoveCommand implements RoverCommands {

    Rover rover;

    public MoveCommand(Rover rover) {
        this.rover = rover;
    }

    @Override
    public String execute() {
        return rover.move();
    }

    @Override
    public boolean hasName(String name) {
        return false;
    }
}
