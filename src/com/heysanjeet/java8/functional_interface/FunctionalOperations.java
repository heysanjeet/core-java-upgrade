package com.heysanjeet.java8.functional_interface;

public class FunctionalOperations {
    public static void main(String[] args) {

        Algorithms algorithms=(num1,num2)->{
            return num1+num2;
        };

        System.out.println(algorithms.calculate(10,56));
        algorithms.sayHello();
        Algorithms.sayHelloStatic();
    }
}
