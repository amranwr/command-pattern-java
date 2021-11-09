package com.company;

import java.util.ArrayList;

public class Remote {
    private Switchable[] onCommands;
    private Switchable[] offCommands;
    private static final int NUMBEROFBUTTONS = 10;
    private NoCommand noCommand;
    public Remote(){
        this.onCommands = new Switchable[NUMBEROFBUTTONS];
        this.offCommands = new Switchable[NUMBEROFBUTTONS];
        this.noCommand = new NoCommand();
        for(int i =0 ; i < NUMBEROFBUTTONS ; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void onCommandButtonPressed(int slot ){
        assertSlot(slot);
        onCommands[slot-1].execute();
    }

    public void offCommadButtonPressed(int slot){
        assertSlot(slot);
        offCommands[slot-1].execute();
    }

    public void addCommand(int slot , Switchable onCommand, Switchable offCommand){
        assertSlot(slot);
        onCommands[slot-1] = onCommand;
        offCommands[slot-1] = offCommand;
    }

    public void delectCommand(int index){
        assertSlot(index);
        onCommands[index-1] = noCommand;
        offCommands[index-1] = noCommand;
    }

    public void assertSlot(int index){
        assert index >0 && index<= NUMBEROFBUTTONS;
    }

}
