package com.orios.bridge.demo;

 abstract public class ElectronicGoods {
     //Composition - implementor
     protected State state;

     public State getState(){
         return state;
     }

     public void setState(State state){
         this.state = state;
     }

     //Implementation specific
     //we are delegating to the specific implementation
     public void moveToCurrentState(){
         System.out.println("The electronic item is function at : ");
         state.moveState();
     }
     public void hardButtonPressed(){
         state.hardPressed();
     }
}
