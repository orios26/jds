package com.orios.mediator.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    List<Employee> participants = new ArrayList<Employee>();
    @Override
    public void register(Employee employee) {
        participants.add(employee);
    }

    public void displayRegisteredEmployees(){
        System.out.println("Registered Employees:");
        for (Employee employee: participants){
            System.out.println(employee.getName());
        }
    }

    @Override
    public void sendMessage(Employee employee, String msg) throws InterruptedException {
        if(participants.contains(employee)){
            System.out.println(employee.getName() + "post: "
            + msg + " Last message posted at " + LocalDateTime.now());
            Thread.sleep(1000);
        }
        else {
            System.out.println("Employee " + employee.getName() + " not registered");
        }
    }
}
