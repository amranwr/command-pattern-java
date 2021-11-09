package com.company;

public class FanOnCommand implements Switchable{
    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.fan.on();
    }
}
