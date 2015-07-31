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
}
