package com.orios.modifiedVisitor.demo;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements Employee {
    private String name;
    private String department;
    private final int yearsOfExpierence;
    private List<Employee> controls;

    public CompositeEmployee(String name, String department, int yearsOfExpierence){
        this.name = name;
        this.department = department;
        this.yearsOfExpierence = yearsOfExpierence;
        controls = new ArrayList<>();
    }

    public void addEmployee(Employee e){
        controls.add(e);
    }

    public void removeEmployee(Employee e){
        controls.remove(e);
    }

    public String getName(){
        return  name;
    }

    public String getDepartment(){
        return department;
    }

    public int getYearsOfExpierence(){
        return yearsOfExpierence;
    }

    public List<Employee> getControls(){
        return controls;
    }

    @Override
    public void printStructures() {
        System.out.printf("%s works in %s and has %d years of experience\n", getName(), getDepartment(), getYearsOfExpierence());
        controls.forEach(Employee::printStructures);
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
