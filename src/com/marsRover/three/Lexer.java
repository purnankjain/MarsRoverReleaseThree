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

    public ArrayList<String> lexStates(String states) {
        String[] tempStringArray = states.split(" ");
        ArrayList<String> temp = new ArrayList<String>();
        for(String str : tempStringArray) {
            temp.add(str);
        }
        return temp;
    }
}
