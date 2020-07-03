package com.orios.interpreter.demo;

public class IndividualEmployee implements Employee{

    private int yearsExperience;
    private String currentGrade;

    public IndividualEmployee(int yearsExperience, String currentGrade){
        this.yearsExperience = yearsExperience;
        this.currentGrade = currentGrade;
    }

    @Override
    public boolean interpret(Context context) {
        if (this.yearsExperience >= context.getYearsExperience() && context.getPermissibleGrades().contains(this.currentGrade)){
         return true;
        }
        return false;
    }
}
