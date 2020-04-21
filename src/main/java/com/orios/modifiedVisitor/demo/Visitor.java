package com.orios.modifiedVisitor.demo;

public interface Visitor {
    void visitTheElement(CompositeEmployee compositeEmployee);
    void visitTheElement(SimpleEmployee simpleEmployee);

}
