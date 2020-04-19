package com.orios.modifiedadapter.demo;

public class Triangle implements TriInterface{
    public double base;
    public double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        String info = String.format("Triangle Object with base: %.2f unit and height: %.2f unit", base, height);
        System.out.println(info);
    }

    @Override
    public double calculateAreaOfTriangle() {
        return 0.5 * base * height;
    }
}
