package com.orios.modifiedVisitor.demo;

public class SimpleEmployee implements Employee {
    private String name;
    private String department;
    private int yearsOfExpierience;

    public SimpleEmployee(String name, String department, int yearsOfExpierience){
        this.name = name;
        this.department = department;
        this.yearsOfExpierience = yearsOfExpierience;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public int getYearsOfExpierience(){
        return yearsOfExpierience;
    }

    @Override
    public void printStructures() {
        System.out.printf("%s works in %s and has %d years of experience\n", getName(), getDepartment(), getYearsOfExpierience());
    }

    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visitTheElement(this);
    }
}
