package com.orios.facade.demo;

public class RobotBody {

    public static void createRobot(){
        System.out.println("Refer to manual before creation of Robot");
    }

    public void createHands(){
        System.out.println("Hands manufactered");
    }
    public void createRemainingParts(){
        System.out.println("Remaining parts (other than hands) are created");
    }

    public static void destroyRobot(){
        System.out.println("Refer the manual before destroying of a robot");
    }

    public void destroyHands(){
        System.out.println("The robot's hands are destroyed");
    }

    public void destroyRemainingParts(){
        System.out.println("The robot's remaining parts are destroyed.");
    }
}
