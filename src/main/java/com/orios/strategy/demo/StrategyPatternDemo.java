package com.orios.strategy.demo;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Demo***\n");
        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("_________");
        vehicleContext = new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
    }
}
