package com.heysanjeet.java8.static_methods;

public class Honda implements Vehicle {


    @Override
    public int getSpeed() {
        return 180;
    }

    @Override
    public void applyBreak() {
        System.out.println("Applied break...");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.applyBreak();
        System.out.println(honda.getSpeed());
        honda.autoPilot();
        Vehicle.sayHello();//method call from interface
        Honda.sayHello();//local method from impl
    }

    public static void sayHello() {
        System.out.println("Honda is my favorite car...");
    }
}
