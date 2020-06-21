package com.orios.state.demo;

public class On implements PossibleState {
    @Override
    public void pressOnButton(TV context) {
        System.out.println("TV is already in On State. No state change");
    }

    @Override
    public void pressOffButton(TV context) {
        System.out.println("You pressed Off button. Going from On to Off state");
        context.setCurrentState(new Off());
        System.out.println(context.getCurrentState().toString());
    }

    @Override
    public void pressMuteButton(TV context) {
        System.out.println("Mute button pressed, changing from On state to Mute");
        context.setCurrentState(new Mute());
        System.out.println(context.getCurrentState().toString());
    }

    public String toString(){
        return "\t**TV is switched on now.**";
    }
}
