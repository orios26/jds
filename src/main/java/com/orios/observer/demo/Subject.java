package com.orios.observer.demo;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private int flag;
    //keep track of all observer in a list
    List<Observer> observerList = new ArrayList<>();

    public int getFlag(){
        return flag;
    }

    public void setFlag(int flag){
        this.flag = flag;
        //notify observers whenever the flag is updated
        notifyRegisteredUsers(flag);
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyRegisteredUsers(int updatedValue) {
        observerList.forEach(observer -> {
            observer.update(updatedValue);
        });
    }
}
