package com.orios.memento.demo;

public class Originator {
    /*
    Make an object (Originator class) itself responsible for:
    1. Saving its internal state to a memento object
    2. Restoring to a previous state from a memento object
    3. Only the originator of said memento can access it
     */

    private int stateId;
    public Originator(){
        this.stateId = 0;
        System.out.println("Originator create with state: " + stateId);
    }

    public int getStateId(){
        return stateId;
    }

    public void setStateId(int stateId){
        System.out.println("Setting originator state to " + stateId);
        this.stateId = stateId;
    }

    public Memento saveMemento(){
        System.out.println("Saving originator's current State: " + stateId);
        return new Memento(stateId);
    }

    public void returnToPreviousState(Memento previousState){
        System.out.println("Reverting to previous state: " + previousState.getStateId());
        this.stateId = previousState.getStateId();
    }
}
