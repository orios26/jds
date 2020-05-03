package com.orios.template.demo;

public abstract class BasicEngineering {
    public final void completeCourse(){
        completeMath();
        completeSoftSkills();
        completeSpecializedCourse();
    }

    public void completeMath(){
        System.out.println("Completed 1.Mathematics");
    }

    public void completeSoftSkills(){
        System.out.println("Completed 2.Soft Skills");
    }

    public abstract void completeSpecializedCourse();
}
