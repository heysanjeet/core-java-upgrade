package com.heysanjeet.java8.static_methods;

public class StaticSample2 implements StaticSample1{

    private static void print(){
        System.out.println("Print in client");
    }
    public static void main(String[] args) {
        StaticSample2 staticSample2=new StaticSample2();
        StaticSample2.print();
        StaticSample1.print();
    }
}
