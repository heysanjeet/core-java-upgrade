package com.heysanjeet.design_pattern;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon() {
    }

    public static synchronized SingleTon getObject() {
        if (instance == null) {
            instance=new SingleTon();
        }
        return instance;
    }
}
