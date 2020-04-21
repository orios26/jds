package com.orios.modifiedVisitor.demo;

import java.util.List;

public class ModifiedVisitorPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Modified Visitor Pattern Demo***\n");

        SimpleEmployee mathTeacher1 = new SimpleEmployee("Math Teacher1", "Math", 13);
        SimpleEmployee mathTeacher2 = new SimpleEmployee("Math Teacher2", "Math", 11);

        SimpleEmployee CSETeacher1 = new SimpleEmployee("CSE Teacher1", "CS-E", 14);
        SimpleEmployee CSETeacher2 = new SimpleEmployee("CSE Teacher2", "CS-E", 10);
        SimpleEmployee CSETeacher3 = new SimpleEmployee("CSE Teacher3", "CS-E", 7);

        CompositeEmployee hodCSE = new CompositeEmployee("CSE HOD", "CS-E", 16);
        CompositeEmployee hodMath = new CompositeEmployee("Math HOD", "Math", 22);

        CompositeEmployee principal = new CompositeEmployee("Principal", "Planning-Supervising-Managing", 21);

        principal.addEmployee(hodCSE);
        principal.addEmployee(hodMath);

        hodCSE.addEmployee(CSETeacher1);
        hodCSE.addEmployee(CSETeacher2);
        hodCSE.addEmployee(CSETeacher3);
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);

        //print overall structure
        principal.printStructures();

        System.out.println("Introducing our Visitor\n");
        Visitor visitor = new ConcreteVisitor();
        //iterate through each list of controls
        List<Employee> employeeList = principal.getControls();
        employeeList.forEach(employee -> {
            employee.acceptVisitor(visitor);
        });

        employeeList = hodCSE.getControls();
        employeeList.forEach(employee -> {
            employee.acceptVisitor(visitor);
        });

        employeeList = hodMath.getControls();
        employeeList.forEach(employee -> {
            employee.acceptVisitor(visitor);
        });
    }

}
