package com.marsRover.three;

import java.util.ArrayList;

public class Parser {

    Lexer lexer;
    Rover rover;

    public Parser(Lexer lexer) {
        this.lexer = lexer;
        this.rover = null;
    }


    public ArrayList<RoverCommands> parseCommands(String commands) {
        ArrayList<RoverCommands> commandList = new ArrayList<RoverCommands>();
        ArrayList<String> strCommands = lexer.lexCommands(commands);
        for(String str : strCommands) {
            switch (str) {
                case "L" : commandList.add(new LeftCommand(rover));
                    break;
                case "R" : commandList.add(new RightCommand(rover));
                    break;
                case "M" : commandList.add(new MoveCommand(rover));
                    break;
            }
        }
        return commandList;
    }

    public Rover parseRover(String userInput) {
        ArrayList<String> states = lexer.lexStates(userInput);
        int x;
        int y;
        String sDirection;
        x = Integer.parseInt(states.get(0));
        y = Integer.parseInt(states.get(1));
        sDirection = states.get(2);
        rover = new Rover(x, y, sDirection);
        return rover;
    }
}
