package com.orios.command.demo;

public class CommandPatternExample {
    public static void main(String[] args) {
        System.out.println("***Command Pattern Demo\n");
        Receiver intendedReceiver = new Receiver();

        UndoCommand undoCommand = new UndoCommand(intendedReceiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(undoCommand);
        invoker.invokeCommand();
        RedoCommand redoCommand = new RedoCommand(intendedReceiver);
        invoker.setCommand(redoCommand);
        invoker.invokeCommand();
    }
}
