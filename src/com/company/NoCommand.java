package com.company;

public class NoCommand implements Switchable{
    @Override
    public void execute() {
        System.out.println("no command for this button");
    }
}
