package com.heysanjeet.java8.default_methods;

public class Honda implements Vehicle {
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void autoPilot() {
        System.out.println("Running in honda");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        System.out.println(honda.getSpeed());
        honda.autoPilot();
    }
}
