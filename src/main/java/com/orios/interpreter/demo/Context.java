package com.orios.interpreter.demo;

import java.util.ArrayList;
import java.util.List;

public class Context {
    private int yearsExperience;
    private List<String> permissibleGrades;

    public Context(int yearsExperience, String...allowedGrades){
        this.yearsExperience = yearsExperience;
        this.permissibleGrades = new ArrayList<>();
        for (String grade: allowedGrades) {
            permissibleGrades.add(grade);
        }
    }

    public int getYearsExperience(){
        return yearsExperience;
    }

    public List<String> getPermissibleGrades(){
        return permissibleGrades;
    }
}
