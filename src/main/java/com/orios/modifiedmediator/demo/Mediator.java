package com.orios.modifiedmediator.demo;

public interface Mediator {
    void register(Employee employee);
    void sendMessage(Employee fromEmployee, Employee toEmployee, String msg) throws InterruptedException;
}
