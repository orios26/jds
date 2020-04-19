package com.orios.composite.demo;

public class CompositePatternExample {
    /**
     * Principal is at the top of hierarchy structure
     * HOD - Maths & CompSci report directly to him
     * Teachers of Maths & CS-E report to the HODs
     */

    public static void main(String[] args) {
        System.out.println("***Composite Pattern Demo***\n");

        //regular employee objects
        Employee mathTeacher1 = new Employee("Math Teacher 1", "Math");
        Employee mathTeacher2 = new Employee("Math Teacher 2", "Math");
        Employee cseTeacher1 = new Employee("CSE Teacher 1", "CS-E");
        Employee cseTeacher2 = new Employee("CSE Teacher 2", "CS-E");
        Employee cseTeacher3 = new Employee("CSE Teacher 3", "CS-E");

        //we use composite employee object to represent the HODs
        CompositeEmployee hodMath = new CompositeEmployee("Mr.S.Das(HOD: Math)", "Math");
        CompositeEmployee hodCSE = new CompositeEmployee("Mr.V.Sacar(HOD: CS-E)", "CS-E");

        //we also use composite object to represent the principal
        CompositeEmployee principal = new CompositeEmployee("Dr.EggHead", "Planning-Supervising-Managing");

        //add employees to respective composite objects
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);
        hodCSE.addEmployee(cseTeacher1);
        hodCSE.addEmployee(cseTeacher2);
        hodCSE.addEmployee(cseTeacher3);

        //add HODs to principal object
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCSE);

        System.out.println("Entire Structure \n");
        principal.printStructures();
        System.out.println(String.format("Principal oversees %d employees \n", principal.getEmployeeCount()));

        System.out.println("College of Mathematics Structure");
        hodMath.printStructures();
        System.out.println(String.format("Head of Mathematics oversees %d employees\n", hodMath.getEmployeeCount()));

        System.out.println("College of Computer Science and Engineering structure");
        hodCSE.printStructures();
        System.out.println(String.format("Head of CS-E oversees %d employees\n", hodCSE.getEmployeeCount()));

    }
}

