package com.orios.flyweight.demo;

import java.util.Random;

public class FlyWeightPatternExample {

    public static void main(String[] args) throws Exception {
        RobotFactory robotFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example***\n");
        Robot robot;
        for(int i =0; i < 3; i++){
            robot = RobotFactory.getRobotFromFactory("small");
            Thread.sleep(1000);
            robot.showMe(getRandomColor());
        }
        System.out.println(String.format("Distinct robots at this point %d", robotFactory.totalObjectsCreated()));
        for(int i =0; i < 5; i++){
            robot = RobotFactory.getRobotFromFactory("large");
            Thread.sleep(1000);
            robot.showMe(getRandomColor());
        }
        System.out.println(String.format("Distinct robots at this point %d", robotFactory.totalObjectsCreated()));
        for(int i =0; i < 4; i++){
            robot = RobotFactory.getRobotFromFactory("fixed");
            Thread.sleep(1000);
            robot.showMe(getRandomColor());
        }
        System.out.println(String.format("Distinct robots at this point %d", robotFactory.totalObjectsCreated()));
    }

    public static String getRandomColor(){
        Random random = new Random();
        int rInt = random.nextInt();
        if (rInt %2 ==0){
            return "green";
        }
        else{
            return "red";
        }
    }
}
