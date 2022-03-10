package com.company;

public class MyServiceEager {
    // (A private constructor)
    // (A static field containing its only instance)
    // (A static factory method for obtaining the instance)

    // Early Access Initialization
    // Eager
    private static MyServiceEager instance = new MyServiceEager();

    private MyServiceEager(){}

    public static MyServiceEager getInstance(){
        return MyServiceEager.instance;
    }


}
