package com.orios.bridge.demo;

public class DVD extends ElectronicGoods {

    /**
     * DVD specific method is coded with superclass methods but not with implementor (State) method.
     * This approach will allow to vary the abstraction and implementation independently
     */
    public void doublePressed(){
        hardButtonPressed();
        hardButtonPressed();
    }

}
