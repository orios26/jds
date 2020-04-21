package com.orios.observer.demo;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demo***\n");

        Observer observer1 = new ObserverType1("Observer1.1");
        Observer observer2 = new ObserverType2("Observer2.1");
        Observer observer3 = new ObserverType1("Observer1.2");

        Subject subject = new Subject();
        //register observers to subject
        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        System.out.println("Setting flag to 5\n");
        subject.setFlag(5);
        subject.unregister(observer1);

        System.out.println("Setting flag to 50\n");
        subject.setFlag(50);

        //re-register old observer and add additional one
        Observer observer4 = new ObserverType3("Observer3.1");
        subject.register(observer1);
        subject.register(observer4);

        //setting flag to 100
        System.out.println("Setting flag to 100\n");
        subject.setFlag(100);
    }
}
