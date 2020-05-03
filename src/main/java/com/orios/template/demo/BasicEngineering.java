package com.orios.template.demo;

public abstract class BasicEngineering {
    public final void completeCourse(){
        completeMath();
        completeSoftSkills();
        completeSpecializedCourse();
        if (isAdditionalRequirementsNeeded()){
            completeAdditionalRequirements();
        }
    }

    public void completeMath(){
        System.out.println("Completed 1.Mathematics");
    }

    public void completeSoftSkills(){
        System.out.println("Completed 2.Soft Skills");
    }

    public void completeAdditionalRequirements(){
        System.out.println("4.Technical Elective required for all Computer Science students");
    }

    public boolean isAdditionalRequirementsNeeded(){
        return true;
    }

    public abstract void completeSpecializedCourse();
}
