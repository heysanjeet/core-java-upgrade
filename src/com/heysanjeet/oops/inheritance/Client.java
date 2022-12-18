package com.heysanjeet.oops.inheritance;

public class Client {
    public static void main(String[] args) {
        Child child = new Child();
        Super aSuper = new Child();
        System.out.println(aSuper.sValue);
        aSuper.printInSuperClass();

        System.out.println(child.cValue);
    }
}
