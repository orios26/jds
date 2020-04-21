package com.orios.observer.demo;

public class ObserverType1 implements Observer {

    String nameOfObserver;
    public ObserverType1(String nameOfObserver){
        this.nameOfObserver = nameOfObserver;
    }
    @Override
    public void update(int updatedValue) {
        System.out.println(String.format("%s has received an alert: updated value in subject is %d", nameOfObserver, updatedValue));
    }
}
