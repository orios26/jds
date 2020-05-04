package com.orios.command.demo;

public interface Command {
    /*
    Normally this method is called with no arguments
    1. we supply all necessary information when it is created
    2. Invoker may reside in a different address space
     */
    void executeCommand();
}
