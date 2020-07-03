package com.orios.interpreter.demo;

public class EmployeeBuilder {

    public Employee buildExpression(Employee emp1, String operator, Employee emp2){
        switch (operator.toUpperCase()){
            case "OR":
                return new OrExpression(emp1, emp2);
            case "AND":
                return new AndExpression(emp1, emp2);
            case "NOT":
                return new NotExpression(emp1);
            default:
                System.out.println("Only OR, AND, NOT operations allowed");
                return null;
        }
    }
}
