package com.orios.interpreter.demo;

public class NotExpression implements Employee{

    private Employee emp1;

    public NotExpression(Employee emp1){
        this.emp1 = emp1;
    }

    @Override
    public boolean interpret(Context context) {
        return !emp1.interpret(context);
    }
}
