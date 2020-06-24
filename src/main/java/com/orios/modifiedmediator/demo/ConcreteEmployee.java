package com.orios.modifiedmediator.demo;

public class ConcreteEmployee extends Employee{
    public ConcreteEmployee(Mediator mediator, String name, boolean authorizedUser) {
        super(mediator, name, authorizedUser);
    }
}
