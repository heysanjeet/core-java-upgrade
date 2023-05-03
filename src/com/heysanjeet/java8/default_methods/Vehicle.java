package com.heysanjeet.java8.default_methods;

public interface Vehicle {
    public int getSpeed();

    public default void autoPilot() {
        System.out.println("I will help to run vehicle automatically...");
    }
}
