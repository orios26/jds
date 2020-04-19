package com.orios.flyweight.demo;

public class FixedSizeRobot implements Robot{
    private final String robotTypeCreated;

    public FixedSizeRobot(){
        robotTypeCreated="fixed size robot";
        System.out.println(robotTypeCreated);
    }
    @Override
    public void showMe(String color) {
        System.out.println("with " + " blue (default) color");
    }
}
