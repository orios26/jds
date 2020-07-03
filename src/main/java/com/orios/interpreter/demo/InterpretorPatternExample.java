package com.orios.interpreter.demo;

public class InterpretorPatternExample {
    public static void main(String[] args) {
        System.out.println("***Interpretor Pattern Demo***\n");
        Context context = new Context(10, "G2", "G3");

        Employee emp1 = new IndividualEmployee(5, "G1");
        Employee emp2 = new IndividualEmployee(10, "G2");
        Employee emp3 = new IndividualEmployee(15, "G3");
        Employee emp4 = new IndividualEmployee(20, "G4");

        EmployeeBuilder builder = new EmployeeBuilder();

        //pass context to all employee interpret methods
        System.out.printf("employee 1 is eligible for promotion %b \n", emp1.interpret(context));
        System.out.printf("employee 2 is eligible for promotion %b \n", emp2.interpret(context));
        System.out.printf("employee 3 is eligible for promotion %b \n", emp3.interpret(context));
        System.out.printf("employee 4 is eligible for promotion %b \n", emp4.interpret(context));

        System.out.printf("Is either employee 1 or 3 eligible for promotion?  %b \n", builder.buildExpression(emp1, "or", emp2).interpret(context));
        System.out.printf("Are both employee 2 and 4 eligible for promotion?  %b \n", builder.buildExpression(emp2, "and", emp4).interpret(context));
        System.out.printf("Is employee 4 not eligible for promotion?  %b \n", builder.buildExpression(emp1, "not", null).interpret(context));
    }
}
