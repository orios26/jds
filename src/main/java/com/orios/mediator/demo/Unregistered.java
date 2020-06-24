package com.orios.mediator.demo;

public class Unregistered extends Employee {

    public Unregistered(Mediator mediator, String name){
        super(mediator);
        this.name = name;
    }

    @Override
    public String employeeType() {
        return this.getClass().toString();
    }
}
