package com.orios.visitor.demo;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(MyClass myClassObject) {
        System.out.println("Current value of myInt " + myClassObject.getMyInt());
        System.out.println("Visitor will modify and display");
        System.out.println("Current value of myInt " + 2* myClassObject.getMyInt());
        System.out.println("Exiting visitor");
    }
}
