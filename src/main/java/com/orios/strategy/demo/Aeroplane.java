package com.orios.strategy.demo;

public class Aeroplane extends Vehicle {

    public Aeroplane(){
        transportMedium = new AirTransport();
    }

    @Override
    public void showMe() {
        System.out.println("Im a Aeroplane");
    }
}
