package com.orios.template.demo;

public class TemplateMethodPatternExample {
    public static void main(String[] args) {
        System.out.println("***Template Method Pattern Demo***\n");
        BasicEngineering preferredCourse = new ComputerScience();
        System.out.println("Computer Science courses must be completed in the following order:\n");
        preferredCourse.completeCourse();
        System.out.println("");

        preferredCourse = new Electronics();
        System.out.println("Electronics courses must be completed in the following order:\n");
        preferredCourse.completeCourse();
        System.out.println("");

    }
}
