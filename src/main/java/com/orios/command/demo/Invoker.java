package com.orios.command.demo;

public class Invoker {
    Command commandToPerform;

    public void setCommand(Command commandToPerform){
        this.commandToPerform = commandToPerform;
    }

    public void invokeCommand(){
        commandToPerform.executeCommand();
    }
}
