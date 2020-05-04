package com.orios.memento.demo;

public class Memento {
    private int stateId;
    public Memento(int stateId){
        this.stateId = stateId;
    }

    public int getStateId(){
        return stateId;
    }
}
