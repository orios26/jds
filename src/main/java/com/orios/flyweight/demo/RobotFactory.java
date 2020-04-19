package com.orios.flyweight.demo;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String, Robot> robotFactory = new HashMap<String, Robot>();

    public int totalObjectsCreated(){
        return robotFactory.size();
    }

    public static synchronized Robot getRobotFromFactory(String robotType) throws Exception{
        Robot robotCategory = robotFactory.get(robotType);
        if(robotCategory == null){
            switch(robotType){
                case "small":
                    System.out.println("no small robots cached, creating new one");
                    robotCategory = new SmallRobot();
                    break;
                case "large":
                    System.out.println("No large robots cached, creating a new one");
                    robotCategory = new LargeRobot();
                    break;
                case "fixed":
                    System.out.println("No fixed sized robots cached, creating a new one");
                    robotCategory = new FixedSizeRobot();
                    break;
                default:
                    throw new Exception("Robot Factory can only create small, large, and Fixed size robots");
            }
            robotFactory.put(robotType, robotCategory);
        }
        else {
            System.out.println(String.format("using cached robot %s and coloring it ", robotType));
        }
        return robotCategory;
    }
}
