package com.orios.bridge.demo;

public class OffState implements State {
    @Override
    public void hardPressed() {
        System.out.println("Device is already in Off State\n");
    }

    @Override
    public void moveState() {
        System.out.println("Off State\n");
    }
}
