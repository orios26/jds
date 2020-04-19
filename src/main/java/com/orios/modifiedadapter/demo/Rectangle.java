package com.orios.modifiedadapter.demo;

public class Rectangle implements RectInterface {

    public double length;
    public double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public void aboutRectangle() {
        String info = String.format("Rectangle object with length: %.2f unit and width: %.2f unit", length, width);
        System.out.println(info);
    }

    @Override
    public double calculateAreaOfRectangle() {
        return length * width;
    }
}
