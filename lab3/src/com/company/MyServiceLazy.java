package com.company;

public class MyServiceLazy {
    // (A private constructor)
    // (A static field containing its only instance)
    // (A static factory method for obtaining the instance)

    // Lazy
    private static MyServiceLazy instance;
    private MyServiceLazy(){}

    /*public*/ static MyServiceLazy getInstance(){
        if(instance == null)
            instance = new MyServiceLazy();
        return MyServiceLazy.instance;
    }


}
