package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Remote remote = new Remote();
        Fan fan = new Fan();
        remote.addCommand(1,new FanOnCommand(fan),new FanOffCommand(fan));
        remote.onCommandButtonPressed(1);
        remote.onCommandButtonPressed(6);
        remote.onCommandButtonPressed(11);
    }
}
