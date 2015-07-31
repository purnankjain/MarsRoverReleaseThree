package com.marsRover.three;

import java.util.ArrayList;

public class Lexer {

    public ArrayList<String> lexCommands(String commands) {
        ArrayList<String> temp = new ArrayList<String>();
        for (char c : commands.toCharArray()) {
            temp.add(c + "");
        }
        return temp;
    }
}
