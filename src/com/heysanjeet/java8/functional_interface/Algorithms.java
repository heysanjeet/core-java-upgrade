package com.heysanjeet.java8.functional_interface;

@FunctionalInterface
public interface Algorithms {
    public int calculate(int a, int b);

    public default void sayHello() {
        System.out.println("Hello default method , In Fictional Interface");
    }

    public static void sayHelloStatic() {
        System.out.println("Hello static method , In Fictional Interface");
    }
}
