package com.orios.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee{

    private int employeeCount=0;

    private String name;
    private String department;

    //container for child objects
    private List<IEmployee> controls;

    public CompositeEmployee(String name, String department){
        this.name = name;
        this.department = department;
        controls = new ArrayList<IEmployee>();
    }
    public void addEmployee(IEmployee e){
        controls.add(e);
    }
    public void removeEmployee(IEmployee e){
        controls.remove(e);
    }
    @Override
    public void printStructures() {
        System.out.println(String.format("%s works in %s", name, department));
        controls.forEach(employee -> {
            employee.printStructures();
        });
    }

    @Override
    public int getEmployeeCount() {
        employeeCount=controls.size();
        //yay recursion ;)
        controls.forEach(employee -> {
            employeeCount+=employee.getEmployeeCount();
        });
        return employeeCount;
    }
}
