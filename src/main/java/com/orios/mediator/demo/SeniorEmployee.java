package com.orios.mediator.demo;

public class SeniorEmployee extends Employee {

    public SeniorEmployee(Mediator mediator, String name){
        super(mediator);
        this.name = name;
    }

    @Override
    public String employeeType() {
        return this.getClass().getSimpleName();
    }
}
