package com.orios.modifiedadapter.demo;

public class ModifiedAdapterPatternExample {
    public static void main(String[] args) {
        System.out.println("***Modified Adapter Pattern Demo***\n");
        Rectangle rectangle = new Rectangle(20, 10);
        String areaOfRectangle = String.format("Area of Rectangle is: %.2f Square unit", rectangle.calculateAreaOfRectangle());
        System.out.println(areaOfRectangle);

        Triangle triangle = new Triangle(10, 5);
        String areaOfTriangle = String.format("Area of Triangle is %.2f square unit", triangle.calculateAreaOfTriangle());
        System.out.println(areaOfTriangle);
        System.out.println("*****************\n");
        RectInterface adapter = new TriangleAdapter(triangle);
        System.out.println("calculating area of triangle with adapter");
        String areaOfTriangleWithAdapter = String.format("Area of Triangle is %.2f square unit", adapter.calculateAreaOfRectangle());
        System.out.println(areaOfTriangleWithAdapter);
    }

}
