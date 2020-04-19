package com.orios.composite.demo;

public class Employee implements IEmployee{
    private String name;
    private String department;
    private int employeeCount=0;

    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }
    @Override
    public void printStructures() {
        System.out.println(String.format("%s works in %s", name, department));
    }

    @Override
    public int getEmployeeCount() {
        return employeeCount;
    }
}
