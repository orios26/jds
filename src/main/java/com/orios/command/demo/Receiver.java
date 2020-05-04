package com.orios.command.demo;

public class Receiver {

    public void performUndo(){
        System.out.println("Performing undo command in receiver");
    }

    public void performRedo(){
        System.out.println("Performing redo command in receiver");
    }

    public void doOptionalTaskPriorToUndo(){
        System.out.println("Performing optional Undo tasks in receiver");
    }

    public void doOptionalTaskPriorToRedo(){
        System.out.println("Performing optional Redo tasks in receiver");
    }
}
