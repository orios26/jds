package com.orios.observer.demo;

public interface ISubject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyRegisteredUsers(int updatedValue);
}
