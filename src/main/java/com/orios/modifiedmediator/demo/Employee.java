package com.orios.modifiedmediator.demo;

public abstract class Employee {
    private Mediator mediator;
    protected String name;
    private boolean authorizedUser;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Employee(Mediator mediator, String name, boolean authorizedUser){
        this.mediator = mediator;
        this.name = name;
        this.authorizedUser = authorizedUser;
        if (authorizedUser){
            mediator.register(this);
        }
    }

    public void send(Employee toEmployee, String msg) throws InterruptedException{
        mediator.sendMessage(this, toEmployee, msg);
    }

    public void receive(Employee fromEmployee, String msg){
        System.out.println(this.name + " received a message:"
        + msg + " from-" + fromEmployee.getName());
    }

    public String employeeType(){
        return this.getClass().getSimpleName();
    }
}
