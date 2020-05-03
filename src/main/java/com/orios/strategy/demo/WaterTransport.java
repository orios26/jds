package com.orios.strategy.demo;

public class WaterTransport implements TransportMedium {

    @Override
    public void transport() {
        System.out.println("Transporting in water");
    }
}
