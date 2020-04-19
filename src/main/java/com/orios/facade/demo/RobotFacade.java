package com.orios.facade.demo;

public class RobotFacade {

    RobotColor robotColor;
    RobotHands robotHands;
    RobotBody robotBody;

    public RobotFacade(RobotColor robotColor, RobotHands robotHands, RobotBody robotBody){
        this.robotColor = robotColor;
        this.robotHands = robotHands;
        this.robotBody = robotBody;
    }

    public void constructMilanoRobot(){
        RobotBody.createRobot();
        System.out.println("Creation of a Milano Robot Start.");
        robotColor.setDefaultColor();
        robotHands.setMilanoHands();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("Finished creating Milano Robot\n");
    }

    public void constructRobonautRobot(){
        RobotBody.createRobot();
        System.out.println("Initiating Robonaut creation process");
        robotColor.setGreen();
        robotHands.setRobonautHands();
        robotBody.createHands();
        robotBody.createRemainingParts();
        System.out.println("A Robonaut Robot is created\n");
    }

    public void destroyMilanoRobot(){
        RobotBody.destroyRobot();
        System.out.println("Milano Robot's desctruction process is started");
        robotHands.resetMilanoHands();
        robotBody.destroyHands();
        robotBody.destroyRemainingParts();
    }
}
