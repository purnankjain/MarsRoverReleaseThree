package com.marsRover.three;

import java.io.BufferedReader;

public class View {
    private BufferedReader bufferedReader;

    public View(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }

    public String readUserInput() {
        try {
            return bufferedReader.readLine();
        }
        catch (Exception e) {

        }
        return null;
    }
}
