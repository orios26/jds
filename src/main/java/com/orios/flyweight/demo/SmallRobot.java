package com.orios.flyweight.demo;

public class SmallRobot implements Robot{

    //instrinsic field
    private final String robotTypeCreated;

    public SmallRobot(){
        robotTypeCreated="small robot";
        System.out.println(robotTypeCreated);
    }
    @Override
    public void showMe(String color) {
        System.out.println("with " + color);
    }
}
