package com.orios.modifiedmediator.demo;

public class UnauthorizedUser extends Employee {
    public UnauthorizedUser(Mediator mediator, String name, boolean authorizedUser) {
        super(mediator, name, authorizedUser);
    }

    @Override
    public void receive(Employee fromEmployee, String msg){
        System.out.println(this.name + msg);
    }
}
