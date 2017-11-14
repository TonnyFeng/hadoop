package com.tonny.study.design.singleton;

/**
 * Created by fengwei on 2017/11/14.
 */
public class Singleton {
    private static Singleton uniqueInstance ;

    private Singleton(){
    }

    public synchronized static Singleton getInSingleton(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
