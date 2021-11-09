package com.company;

public class FanOffCommand implements Switchable{
    private final Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.off();
    }
}
