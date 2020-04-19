package com.orios.bridge.demo;

public class OnState implements State {
    //OnState is the Concrete Implementor of State

    @Override
    public void hardPressed() {
        System.out.println("Device is already in On State\n");

    }

    @Override
    public void moveState() {
        System.out.println("On State\n");
    }
}
