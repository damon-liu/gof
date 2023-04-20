package com.damon.gof.behavior.observer;

public class ObserverPattern {

    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();
        Observer obs1=new ConcreteObserver1();
        Observer obs2=new ConcreteObserver2();
        subject.add(obs1);
        subject.add(obs2);
        subject.notifyObserver();
        System.out.println("111111");
    }
}
