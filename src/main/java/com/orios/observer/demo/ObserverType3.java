package com.orios.observer.demo;

public class ObserverType3 implements Observer {
    private String nameOfObserver;
    public ObserverType3(String nameOfObserver){
        this.nameOfObserver = nameOfObserver;
    }
    @Override
    public void update(int updatedValue) {
        System.out.println(String.format("%s has received an alert: Updated value in subject is %d", nameOfObserver, updatedValue));
    }
}
