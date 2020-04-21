package com.orios.observer.demo;

public class ObserverType2 implements Observer {
    private String nameOfObserver;
    public ObserverType2(String nameOfObserver){
        this.nameOfObserver = nameOfObserver;
    }
    @Override
    public void update(int updatedValue) {
        System.out.println(String.format("%s has received an alert: updated value in subject: %d", nameOfObserver, updatedValue));
    }
}
