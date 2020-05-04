package com.orios.command.demo;

public class RedoCommand implements Command{
    private Receiver receiver;
    public RedoCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void executeCommand() {
        receiver.doOptionalTaskPriorToRedo();
        receiver.performRedo();
    }
}
