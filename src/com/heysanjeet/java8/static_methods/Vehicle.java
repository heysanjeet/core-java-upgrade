package com.heysanjeet.java8.static_methods;

public interface Vehicle {
    public int getSpeed();
    public void applyBreak();
    public default void autoPilot(){
        System.out.println("i will help vehicle to run automatically..");
    }
    public static void sayHello(){
        System.out.println("Hello, this is my favorite car");
    }
}
