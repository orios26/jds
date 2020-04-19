package com.orios.adapter.demo;

public class AdapaterPatternExample {
    static class Rectangle
    {
        public double length;
        public double width;
    }
    static class Calculator
    {
        public double getArea(Rectangle rectangle)
        {
            return rectangle.length * rectangle.width;
        }
    }
    static class Triangle
    {
        public double base;
        public double height;
        public Triangle(int base, int height)
        {
            this.base = base;
            this.height = height;
        }
    }

    static class CalculatorAdapter
    {
        public double getArea(Triangle triangle)
        {
            Calculator calculator = new Calculator();
            Rectangle rectangle = new Rectangle();
            //Area of Triangle=0.5*base*height;
            rectangle.length = triangle.base;
            rectangle.width = 0.5 * triangle.height;
            return calculator.getArea(rectangle);
        }
    }

    public static void main(String[] args) {
        System.out.println("***Adaptern Pattern Demo***\n");
        CalculatorAdapter calculatorAdapter = new CalculatorAdapter();
        Triangle triangle = new Triangle(20,10);
        System.out.println("Area of Triangle is " + calculatorAdapter.getArea(triangle) + " Square unit");
    }

}
