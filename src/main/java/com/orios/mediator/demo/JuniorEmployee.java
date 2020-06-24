package com.orios.mediator.demo;

public class JuniorEmployee extends Employee{

    public JuniorEmployee(Mediator mediator, String name){
        super(mediator);
        this.name = name;
    }
    @Override
    public String employeeType() {
        return getClass().getSimpleName();
    }
}
