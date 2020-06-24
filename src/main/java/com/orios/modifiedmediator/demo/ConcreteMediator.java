package com.orios.modifiedmediator.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    List<Employee> participants = new ArrayList<>();
    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    public void displayRegisteredEmployees(){
        participants.forEach(participant -> {
            System.out.println(participant.getName());
        });
    }

    @Override
    public void sendMessage(Employee fromEmployee, Employee toEmployee, String msg) throws InterruptedException {
        if( fromEmployee.getClass().getSimpleName() == "UnauthorizedUser"){
            System.out.println("Unauthorized user " + fromEmployee.getName()
            + " attempting to contact " + toEmployee.getClass().getSimpleName());
        }
        else if (participants.contains(fromEmployee)){
            System.out.println(fromEmployee.getName() + "----posted@" + LocalDateTime.now());
            Thread.sleep(1000);

            if(participants.contains(toEmployee)){
                toEmployee.receive(fromEmployee, msg);
            }
            else{
                System.out.println("ERROR: Target Recipient not found");
            }
        }
        else {
            System.out.println("Unauthorized user " + fromEmployee.getName()
                    + " attempting to contact " + toEmployee.getName());
        }
    }
}
