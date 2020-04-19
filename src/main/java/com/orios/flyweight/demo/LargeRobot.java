package com.orios.flyweight.demo;

public class LargeRobot implements Robot{

    private final String robotTypeCreated;

    public LargeRobot(){
        robotTypeCreated="large robot";
        System.out.println(robotTypeCreated);
    }
    @Override
    public void showMe(String color) {
        System.out.println("with " + color);
    }
}
