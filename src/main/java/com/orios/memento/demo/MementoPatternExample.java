package com.orios.memento.demo;

public class MementoPatternExample {
    /*
    Caretaker is synonomous with the client class. Can do the following
    1. Request a memento from originator to save the internal state of the originator and
    2. Pass a memento back to the originator (to restore to previous state)
    This enables the save and restore of the originator without violating its encapsulation
     */

    public static void main(String[] args) {
        System.out.println("***Memento Pattern Example***\n");
        Originator originator = new Originator();
        Memento memento;
        originator.setStateId(1);
        memento = originator.saveMemento();

        originator.setStateId(2);
        System.out.println("Current originator state: " + originator.getStateId());
        System.out.println("Reverting state...");
        originator.returnToPreviousState(memento);
        System.out.println("Current originator state: " + originator.getStateId());
    }
}
