package com.orios.state.demo;

public class Mute implements PossibleState {
    @Override
    public void pressOnButton(TV context) {
        System.out.println("On Button pressed. Going from Mute state to On state");
        context.setCurrentState(new On());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button. Going from Mute mode to Off state.");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("Mute button pressed. TV is already in mute");
    }

    public String toString(){
        return "\t**TV is muted now.**";
    }
}
