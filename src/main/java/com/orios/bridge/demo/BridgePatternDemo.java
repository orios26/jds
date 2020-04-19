package com.orios.bridge.demo;

public class BridgePatternDemo {

    public static void main(String[] args) {
        System.out.println("***Bridge Pattern Demo***\n");
        System.out.println("\nDealing with a Television");
        State presentState = new OnState();
        Television television = new Television();
        television.setState(presentState);
        television.moveToCurrentState();
        television.hardButtonPressed();
        //changing to OffState
        presentState = new OffState();
        television.setState(presentState);
        television.moveToCurrentState();

        System.out.println("Dealing with DVD now");
        DVD dvd = new DVD();
        presentState = new OnState();
        dvd.setState(presentState);
        dvd.moveToCurrentState();

        presentState = new OffState();
        dvd.setState(presentState);
        dvd.moveToCurrentState();
        dvd.doublePressed();
    }
}

