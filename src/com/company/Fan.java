package com.company;

public class Fan {
    private int speed ;
    private final static int TOPSPEED = 3;
    public Fan(){
        this.speed = 0 ;
    }
    public void on(){
        speed = (speed+1)%TOPSPEED;
        System.out.println("speed is :"+speed);
    }

    public void off(){
        speed = 0;
        System.out.println("fan is off");
    }
}
