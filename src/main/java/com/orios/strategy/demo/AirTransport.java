package com.orios.strategy.demo;

public class AirTransport implements TransportMedium {

    @Override
    public void transport() {
        System.out.println("Transporting in Air");
    }
}
