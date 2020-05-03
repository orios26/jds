package com.orios.strategy.demo;

public abstract class Vehicle {
    TransportMedium transportMedium;
    public Vehicle(){

    }

    public void showTransportMedium(){
        transportMedium.transport();
    }

    public void commonJob(){
        System.out.println("We all can be used to transport");
    }

    public abstract void showMe();
}
