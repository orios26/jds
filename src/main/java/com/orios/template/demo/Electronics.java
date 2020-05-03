package com.orios.template.demo;

public class Electronics extends BasicEngineering {
    @Override
    public void completeSpecializedCourse() {
        System.out.println("Completed 3.Digital Logic and Circuit Theory");
    }

    //overriding this method here so that it evaluates to false for Electronics students
    @Override
    public boolean isAdditionalRequirementsNeeded(){
        return false;
    }

}
