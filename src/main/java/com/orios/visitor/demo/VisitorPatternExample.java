package com.orios.visitor.demo;

public class VisitorPatternExample {

    public static void main(String[] args) {
        System.out.println("***Visitor Example Demo***\n");
        Visitor visitor = new ConcreteVisitor();
        MyClass myClass = new MyClass();
        myClass.acceptVisitor(visitor);
    }
}
