package com.orios.modifiedVisitor.demo;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visitTheElement(CompositeEmployee compositeEmployee) {
        //employee eligible for promotion if yearsExperience > 15
        Boolean isEligibleForPromotion = compositeEmployee.getYearsOfExpierence() > 15;
        System.out.printf("%s from %s department has %d years of experience. Promotion? %b\n", compositeEmployee.getName(), compositeEmployee.getDepartment(), compositeEmployee.getYearsOfExpierence(), isEligibleForPromotion);
    }

    @Override
    public void visitTheElement(SimpleEmployee simpleEmployee) {
        //employee eligible for promotion if yearsExperience > 12
        Boolean isEligibleForPromotion = simpleEmployee.getYearsOfExpierience() > 12;
        System.out.printf("%s from %s department has %d years of experience. Promotion? %b\n", simpleEmployee.getName(), simpleEmployee.getDepartment(), simpleEmployee.getYearsOfExpierience(), isEligibleForPromotion);
    }
}
