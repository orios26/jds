package com.orios.state.demo;

public class TV {
    private PossibleState currentState;

    public TV(){
        this.setCurrentState(new Off());
    }

    public PossibleState getCurrentState(){
        return currentState;
    }

    public void setCurrentState(PossibleState currentState){
        this.currentState = currentState;
    }

    public void pressOffButton(){
        //calling pressOfButton and passing the TV object as parameter
        currentState.pressOffButton(this);
    }

    public void pressOnButton(){
        currentState.pressOnButton(this);
    }

    public void pressMuteButton(){
        currentState.pressMuteButton(this);
    }
}
